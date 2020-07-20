package novidadesOnze;

import java.io.IOException;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.*;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;


public class ClienteHttpExemplo {

    private static final String uri = "https://http2.akamai.com/demo/h2_demo_frame.html";

    static ExecutorService executor = Executors.newFixedThreadPool(6, new ThreadFactory() {
        @Override
        public Thread newThread(Runnable r) {
            Thread thread = new Thread(r);
            System.out.println("Nova Thread criada " + (thread.isDaemon() ? "daemon" : "") + "ThreadGroup: " + thread.getThreadGroup() );
            return null;
        }
    });

    public static void main(String[] args) throws IOException, InterruptedException {
        //connectAndPrintURLJavaOracle();
        connectAkamaiHttpClient();
    }

    private static void connectAndPrintURLJavaOracle() throws IOException, InterruptedException {

        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create(uri)).build();

        HttpClient httpClient = HttpClient.newHttpClient();
        HttpResponse<String> response = httpClient.send(request, HttpResponse.BodyHandlers.ofString());
        System.out.println("Status code> " + response.statusCode());
        System.out.println("Headers code> " + response.headers());
        System.out.println(response.body());
    }

    private static void connectAkamaiHttpClient(){
        System.out.println("Running HTTP/1.1 exemplo");
        try{
            HttpClient httpClient = HttpClient.newBuilder()
                    .version(HttpClient.Version.HTTP_1_1)
                    .proxy(ProxySelector.getDefault())
                    .build();

            long start = System.currentTimeMillis(); //Medir performance
            HttpRequest mainRequest = HttpRequest.newBuilder()
                    .uri(URI.create(uri))
                    .build();

            HttpResponse<String> response = httpClient.send(mainRequest, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status Code: " +  response.statusCode());
            System.out.println("Headers code> " + response.headers());
            String responsebody = response.body();
            System.out.println(responsebody);

            List<Future<?>> future = new ArrayList<>();
            responsebody
                    .lines()
                    .filter(line -> line.trim().startsWith("<ing height"))
                    .map(line -> line.substring(line.indexOf("src=''") + 5, line.indexOf("'/>") ))
                    .forEach(image -> {
                        Future<?> ingFuture = executor.submit( () -> {
                            HttpRequest ingRequest = HttpRequest.newBuilder()
                                    .uri(URI.create(uri + image))
                                    .build();

                            try {
                                HttpResponse<String> imageResponse = httpClient.send(ingRequest, HttpResponse.BodyHandlers.ofString());
                                System.out.println("Imagem carregada: " + image + "Status Code: " + imageResponse.statusCode());

                            } catch (IOException e) {
                                e.printStackTrace();
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        });
                        future.add(ingFuture);
                        System.out.println("Submetido um futuro para a imagem" + image);
                    });

            future.forEach(f -> {
                try {
                    f.get();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }

            });

            long end = System.currentTimeMillis();
            System.out.println("tempo de carregamento total: " + (end - start) + "ms");

        }catch (InterruptedException e){
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            executor.shutdown();
        }
    }
}
