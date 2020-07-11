package Optionals;

import java.util.*;

public class ExemploOptional {

    public static void main(String[] args){

        Optional<String> optionalString = Optional.of("Valor opcional");
        System.out.println(optionalString.isPresent());
       // System.out.println(optionalString.isEmpty()); // No Works Java 10 and give error in JAVA 14: cannot find symbol

        optionalString.ifPresent(System.out::println);
        /*   // Not Works JAVA 10 and 14
        optionalString.ifPresentOrElse(
              (value) -> System.out.println(value),
             () -> System.out.println("Foo")
        );
         */

        if(optionalString.isPresent()){
            String valor = optionalString.get();
            System.out.println(valor);
        }

        Optional<Double> foo = Optional.of(25.5);
        foo.map((valor) -> valor * 2).ifPresent(System.out::println);


       // Optional<String> canja = Optional.of(255);


        Optional<String> baa = Optional.of("23");
        System.out.println(baa);


        try{
            Optional<String> smile= Optional.of(null);
            System.out.println("SMILE: " + smile.isPresent());

        }catch(NullPointerException e)
        {
            System.out.println("Erro: " + e);
        }

        optionalString.map((valor) -> valor.concat("*****")).ifPresent(System.out::println);
        optionalString.orElseThrow(IllegalAccessError::new);

        System.out.println( Optional.ofNullable(null));
        System.out.println( Optional.ofNullable("Carla"));

       ;



    }
}
