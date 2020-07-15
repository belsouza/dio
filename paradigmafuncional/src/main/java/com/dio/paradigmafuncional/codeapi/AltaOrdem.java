package com.dio.paradigmafuncional.codeapi;

public class AltaOrdem {

    public static int execultarInteracao(Somar numeros, int a, int b){
        return  numeros.somar(a, b);
    }

    public static void main(String[] args){
        //Somar soma = (a, b) -> a + b;
        Somar soma = Integer::sum;
        System.out.println(execultarInteracao(soma, 5,3));
    }
}


interface Somar{
   // public int somar(int a, int b);
   int somar(int a, int b);
}
