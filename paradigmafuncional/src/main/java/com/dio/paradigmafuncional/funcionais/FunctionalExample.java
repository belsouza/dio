package com.dio.paradigmafuncional.funcionais;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.UnaryOperator;

public class FunctionalExample {

    public static void exampleOne(){
        UnaryOperator<Integer> calcularValorvezesTres = valor -> valor * 3;
        int valor = 3;
        System.out.println( "O resultado eh " +  calcularValorvezesTres.apply(10));
    }
    public static void exampleTwo(){
        UnaryOperator<Integer> calcularValorvezesTrinta = valor -> valor * 30;
        int valor = 25;
        System.out.println( "O resultado eh " +  calcularValorvezesTrinta.apply(valor));
    }

   public static void exampleThree(){

        //funcional
        int[] valores = {1,2,3,4,5};
       Arrays.stream(valores)
               .filter(numero -> numero % 2 == 0)
               .map(numero-> numero * 2)
               .forEach(System.out::println);
               //.forEach( numero -> System.out.println(numero));

       //imperativo
       for (int foo : valores) {
           int valor; //Warning: Variable 'valor' initializer '0' is redundant
           if (foo % 2 == 0) {
               valor = foo * 2;
               if (valor != 0) {
                   System.out.println(valor);
               }
           }
       }
   }

   public static void exampleFour(){
       BiPredicate<Integer, Integer> verificarSeEhMaior = (parametro, valorcomparacao) -> parametro > valorcomparacao ;
       System.out.println( verificarSeEhMaior.test(13,12));
       System.out.println( verificarSeEhMaior.test(39,155));
   }

   public static void exampleFive(){
        int valor = 20;
        UnaryOperator<Integer> retornadorDobro = v -> v * 2;
        System.out.println("Dobro: " + retornadorDobro.apply(valor));
        System.out.println("Cte Valor: " + valor);
   }
}
