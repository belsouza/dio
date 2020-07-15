package com.dio.paradigmafuncional.interacoes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Interacoes {

    public static void main(String[] args){
        String[] nomes = {"Goku", "Vegeta", "Bulma", "Piccolo", "Chaos", "Tenchinhan"};
        Integer[] numeros = {1,3,5,7,9,11};
        trabalhandoComLista(nomes);
    }

    public static void imprimirNomesFiltrados( String[] nomes ){
        StringBuilder toshow = new StringBuilder();
        for (String nome : nomes) {
            if (nome.equals("Bulma")) {
                //  toshow += nomes[i];
                toshow.append(nome);
            }
        }
        System.out.println(toshow);
    }

    public static void imprimirNomesFiltradosSegundaVersao( String[] nomes ){

        String paraexibir = Stream.of(nomes)
                .filter(nome->nome.equals("Bulma"))
                .collect(Collectors.joining(""));

        System.out.println(paraexibir);
    }

    public static void imprimirNomes( String... nomes ){
        Stream.of(nomes)
                .forEach(System.out::println);
    }

    public static void imprimirNomesSegundaVersao( String... nomes ){
        for(String nome : nomes){
            System.out.println(nome);
        }
    }

    public static void imprimirNumerosSegundaVersao( Integer... numeros ){
        for(int num : numeros){
            System.out.println(num * 2);
        }
    }

    public static void imprimirNumeros( Integer... numeros ){
        Stream.of(numeros).map( num -> num * 2 )
                .forEach(System.out::println);

    }

    public static void trabalhandoComLista( String... nomes ){
        List<String> lista = new ArrayList<>(Arrays.asList(nomes));
        lista.add("Goten");
        lista.add("Trunks");
        lista.add("Gohan");

        lista.stream()
                .filter(nome -> nome.startsWith("T"))
                .forEach(System.out::println);

    }


}
