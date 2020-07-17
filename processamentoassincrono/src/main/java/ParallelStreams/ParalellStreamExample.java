package ParallelStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class ParalellStreamExample {

    public static void main(String[] args) {
       // operationTwo();
        operationFour();
    }

    private static void operationTwo(){
        //serial
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> fatorialnum(num));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial ::" + (fim - inicio));

        //parallel
        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> fatorialnum(num));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel::" + (fim - inicio));
    }


    private static void operationOne(){
        //serial
        long inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).forEach(num -> System.out.println(fatorialnum(num)));
        long fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Serial ::" + (fim - inicio));

        //parallel
        inicio = System.currentTimeMillis();
        IntStream.range(1, 100000).parallel().forEach(num -> System.out.println(fatorialnum(num)));
        fim = System.currentTimeMillis();
        System.out.println("Tempo de execução Parallel::" + (fim - inicio));
    }

    private static void operationThree(){
        List<String> nomes = Arrays.asList("Pedro", "Marcela", "Joaquina", "Robson", "Teresa");
        nomes.parallelStream().forEach(System.out::println);
    }

    private static void operationFour(){
        List<String> nomes = Arrays.asList("Pedro", "Marcela", "Joaquina", "Robson", "Teresa");
        nomes.stream().parallel().forEach(System.out::println);
    }

    public static long  fatorialnum( long num ){
        long fat = 1, i;
        for(i = num; i > 0; i--){
            fat = fat * i;
        }
        return fat;
    }


}
