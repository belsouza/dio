package novidades;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Random;
import java.util.stream.Collectors;

public class InferencialExample {



    public static void main(String[] args) throws IOException {

        connectAndPrintURLjavaversionTwo();
       // printarNomeCompleto("Pedro", "Pedrosa");

        /* var array = populateit();
        System.out.println(array);
        printarNumeros(array); */

    }

    private static void connectAndPrintURLjava() throws IOException {

        //Pegar o conteudo da pagina
        var url = new URL("https://blog.studiominiboss.com/pixelart?fbclid=IwAR3b0X4Kj26p15c8FUoBj3ntt9iUPbPw_hstI0hZZzwlmxQJnUlhgAoINt8");
        var urlconnection = url.openConnection();

        try( var bufferedReader = new BufferedReader(new InputStreamReader( urlconnection.getInputStream() )))
        {
            System.out.println( bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));

        }catch (Exception e){
            System.out.println("Ops!");
        }

    }

    private static void connectAndPrintURLjavaversionTwo(){

        try{   //Pegar o conteudo da pagina
            var url = new URL("https://blog.studiominiboss.com/pixelart?fbclid=IwAR3b0X4Kj26p15c8FUoBj3ntt9iUPbPw_hstI0hZZzwlmxQJnUlhgAoINt8");
            var urlconnection = url.openConnection();
            try(var bufferedReader = new BufferedReader(new InputStreamReader( urlconnection.getInputStream() ))){
                System.out.println( bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
            }
            catch (Exception e1){
                e1.printStackTrace();
            }
        }catch (Exception e2){
            e2.printStackTrace();
        }
    }


    public static void inferenciaUm() throws IOException {

        //Pegar o conteudo da pagina
        URL url = new URL("https://blog.studiominiboss.com/pixelart?fbclid=IwAR3b0X4Kj26p15c8FUoBj3ntt9iUPbPw_hstI0hZZzwlmxQJnUlhgAoINt8");
        URLConnection urlconnection = url.openConnection();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader( urlconnection.getInputStream() ));
        System.out.println( bufferedReader.lines().collect(Collectors.joining()).replaceAll(">", ">\n"));
    }

    public static ArrayList<Integer> populateit(){
        int i, j, tam;
        Random rand = new Random();
        ArrayList<Integer> numbers = new ArrayList();
        for(j = 0; j < rand.nextInt(10) + 1; j++){
            numbers.add(j, rand.nextInt(100));
        }
        return numbers;
    }

    public static void printarNomeCompleto( String nome, String sobrenome ){
        var nomeCompleto = String.format("%s %s ", nome, sobrenome);
        System.out.println(nomeCompleto);
    }

    public static void printarNumeros( ArrayList<Integer> numeros ){

        //Tem que inicializar uma variavel local indicada com a keyword var
        var soma = 0;
        if(numeros.size() > 0)
        {
            for(int num : numeros){
                soma += num;
            }
        }
        System.out.println( String.format("A soma eh: %s", soma));
    }



}
