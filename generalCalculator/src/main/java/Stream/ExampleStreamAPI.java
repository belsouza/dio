package Stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleStreamAPI {

    public static void main(String[] args)
    {
        List<String> estudantes = new ArrayList<>();
        estudantes.add("Pedro");
        estudantes.add("Thayse");
        estudantes.add("Marcelo");
        estudantes.add("Carla");
        estudantes.add("Juliana");
        estudantes.add("Thiago");
        estudantes.add("Rafael");

        System.out.println("Contagem: " + estudantes.stream().count());
        System.out.println("Maior numero de letras: " + estudantes.stream().max(Comparator.comparingInt(String::length)));
        System.out.println("Menor numero de letras: " + estudantes.stream().min(Comparator.comparingInt(String::length)));
        System.out.println("Com a letra r no nome: " + estudantes.stream().filter((estudante)->estudante.toLowerCase().contains("r")).collect(Collectors.toList()));
        System.out.println("Retorna uma nova coleção com a quantidade de letras: " + estudantes.stream().map( estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length()))).collect(Collectors.toList()));
        System.out.println("Retorna os 3 primeiros elementos: " + estudantes.stream().limit(3).collect(Collectors.toList()));
        System.out.println("Retorna os elementos: " + estudantes.stream().peek(System.out::println).collect(Collectors.toList()));
        System.out.println("Personalizado: " + estudantes.stream().peek( System.err::print ).collect(Collectors.toList()));

        System.out.println("De novo");
        estudantes.stream().forEach(System.out::println);

        System.out.println("Tem algum com w no nome?: " + estudantes.stream().allMatch( (elemento) -> elemento.contains("w")));
        System.out.println("Tem algum com a minusculo ai? :" + estudantes.stream().anyMatch( (elemento) -> elemento.contains("a")));
        System.out.println("Não Tem algum com a minusculo ai? :" + estudantes.stream().noneMatch( (elemento) -> elemento.contains("a")));

        System.out.println("Primeiro elemento da coleção: " );
        estudantes.stream().findFirst().ifPresent(System.out::println);

        System.out.println("Operação encadeada: " );
        System.out.println( estudantes.stream()
                .peek(System.out::println)
                .map(estudante -> estudante.concat(" - ").concat(String.valueOf(estudante.length())))
                .peek(System.out::println)
                .filter((estudante) -> estudante.toLowerCase().contains("r") )
                //.collect( Collectors.toList() )
                //.collect(Collectors.joining())
                //.collect(Collectors.toSet())
                //.collect(Collectors.groupingBy(estudante->estudante.substring( estudante.indexOf(" - ") + 1 )))
        );
    }
}
