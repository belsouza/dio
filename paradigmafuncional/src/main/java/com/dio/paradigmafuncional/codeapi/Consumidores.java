package com.dio.paradigmafuncional.codeapi;

import java.util.function.Consumer;
// O consumer  é uma interface funcional que retorna nada

public class Consumidores {
    public static void main(String[] args){

        Consumer<String> imprimir = System.out::println;
        imprimir.accept("Na,na,na,na,na,na,na, Batman!");


        //Consumer<String> imprimirdois = frase -> System.out.println(frase);
        Consumer<String> imprimirdois = System.out::println;
        imprimirdois.accept("Na,na,na,na,na,na,na,na,na,na,na,na,na,na,na,na,na,na,na, Batman!");
    }
}
