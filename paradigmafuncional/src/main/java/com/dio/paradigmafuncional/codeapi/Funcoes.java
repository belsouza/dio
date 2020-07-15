package com.dio.paradigmafuncional.codeapi;

import java.util.function.Function;

public class Funcoes {

    public static void main(String[] args){
        Function<String, String> retornarNomeContrario = texto -> new StringBuilder(texto).reverse().toString();
        System.out.println(retornarNomeContrario.apply("macarena"));

       // Function<Integer, String> inteiroparastring = string -> Integer.valueOf(string).toString();
        Function<Integer, String> inteiroparastring = Object::toString;
        System.out.println(inteiroparastring.apply(25));

       // Function<String, Integer> stringparainteiro = string -> Integer.valueOf(string) * 2;
        Function<String, Integer> stringparainteiro = string -> Integer.parseInt(string) * 2;
        System.out.println(stringparainteiro.apply("65"));

        Function<String, Long> stringparalong = string -> {
            //return Long.valueOf(string) * 25;
            return Long.parseLong(string) * 25;
        };
        System.out.println(stringparalong.apply("65"));

        Function<String, Integer> stringparainteiroversaodois = Integer::valueOf;
        System.out.println(stringparainteiroversaodois.apply("65"));

    }

}
