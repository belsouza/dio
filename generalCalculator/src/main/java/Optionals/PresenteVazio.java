package Optionals;

//Nem tenta no 14 - error: cannot find symbol optionalString.ifPresentOrElse( System.out :: println, ( ) -> System.out.println("Ausente aqui!"));
//Problema  na atualização do intellij. Todas as configurações do java 14 foram perdidas

import java.util.Optional;

public class PresenteVazio {


    public static void main(String[] args){


        try{
            Optional<String> optionalString = Optional.of("Valor presente");
            System.out.println("Valor opcional está presente! ");
            // optionalString.ifPresentOrElse( (valor) -> System.out.println(valor), ( ) -> System.out.println("Ausente aqui!"));

            Optional<String> optionalNull = Optional.ofNullable(null);
            System.out.println("Valor opcional que não está presente! ");
            // optionalNull.ifPresentOrElse( System.out::println, () -> System.out.println("null = Ausente aqui!"));

            Optional<String> emptyOptional = Optional.empty();
            System.out.println("Valor opcional que não está presente! ");
            //emptyOptional.ifPresentOrElse(System.out::println, ( ) -> System.out.println("empty = Ausente aqui!"));

            Optional<String> optionalNullError = Optional.of(null);
            System.out.println("Valor opcional que lança erro NullPointerException ");
            //optionalNullError.ifPresentOrElse(System.out::println, ( ) -> System.out.println("erro = Ausente aqui!"));
        }
        catch(NullPointerException e){
            System.out.println("Erro!");
        }




    }
}
