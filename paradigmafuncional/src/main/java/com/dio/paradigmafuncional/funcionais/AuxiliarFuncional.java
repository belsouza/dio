package com.dio.paradigmafuncional.funcionais;

@FunctionalInterface
interface Foo{
   String gerar( String valor );
   // default Integer gerarNumero(String valor){ };
}

public class AuxiliarFuncional {

    private static Object buscarUsuario( int iduser ){
        //return the user;
        return new Object();
    }

    public static void main(String[] args){
        //Foo james = valor -> valor;


       // Foo o = valor -> {  return valor;  };
        Foo o = valor -> valor;
        System.out.println(o.gerar("Anne"));
    }


}

