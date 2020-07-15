package com.dio.paradigmafuncional.funcionais;

interface Baa {
    void gerar( String valor ); // PAra Foo m = valor -> System.out.println(valor);
}

public class SegundoAuxiliarFuncional {
    public static void main(String[] args) {

        Baa n = valor -> {
            System.out.println(valor);
            System.out.println(valor);
        };
        n.gerar("Hawk");

        //Baa m = valor -> System.out.println(valor);
        Baa m = System.out::println;
        m.gerar("John");
    }
}
