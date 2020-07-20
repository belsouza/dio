package novidadesOnze;

import java.net.URI;
import java.net.http.HttpRequest;
import java.util.function.Function;

public class Revendo {

    public static void main(String[] args) {

        HttpRequest.newBuilder() .uri(URI.create("https://digitalinnovation.one/")) .GET() .build();

        Function<Integer,Double> dividirPorDois  = (var numero) -> numero / 2.0;
        System.out.println(dividirPorDois.apply(15));

    }
}
