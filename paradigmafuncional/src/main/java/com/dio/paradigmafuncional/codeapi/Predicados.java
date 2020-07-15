package com.dio.paradigmafuncional.codeapi;

import java.util.function.Predicate;

public class Predicados {

    public static void main(String[] args){
        //Predicate<String> isempty = valor->valor.isEmpty() -  Lambda can be replaced with method reference;
        Predicate<String> isempty = String::isEmpty;
        System.out.println(isempty.test(""));
        System.out.println(isempty.test("Mellorine!"));

        Predicate<String> isemptytwo = String::isEmpty;
        System.out.println(isemptytwo.test(""));
        System.out.println(isemptytwo.test("Boo!"));

    }
}
