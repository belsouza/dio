package Optionals;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.OptionalLong;

public class ExemploOptionalPrimitivos {

    public static void main(String[] args){
        System.out.println("Optional de inteiro: ");
        OptionalInt.of(12).ifPresent((value) -> { System.out.println(value);});




        System.out.println("Optional de double: ");
        OptionalDouble.of(52.5).ifPresent( System.out::println );
        

        System.out.println("Optional de long: ");
        OptionalLong.of(658L).ifPresent((value) -> { System.out.println(value);});



    }
}
