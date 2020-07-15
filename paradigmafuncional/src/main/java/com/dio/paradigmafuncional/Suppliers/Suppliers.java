package com.dio.paradigmafuncional.Suppliers;

import java.util.function.Supplier;

public class Suppliers {

    public static void main(String[] args){

        // Supplier<Pessoa> suppliers = () -> new Pessoa(); Warning:(8, 44) Lambda can be replaced with method reference
        Supplier<Pessoa> suppliers = Pessoa::new;
        System.out.println(suppliers.get());

        Supplier<Pessoa> suppliersTwo = () -> new Pessoa("Carla", 25);
        System.out.println(suppliersTwo.get());

        Supplier<Pessoa> newInstance = Pessoa::new;
        System.out.println(newInstance.get());

    }
}
