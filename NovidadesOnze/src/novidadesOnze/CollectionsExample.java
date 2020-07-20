package novidadesOnze;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Set;

public class CollectionsExample {

    public static void main(String[] args) {

        //Lista simples
        List<Integer> numeros =Arrays.asList(5, 6, 7, 8, 13);
        System.out.println(numeros);

        //Collection eh uma interface mae para as listas :)
        Collection<Integer> numeros2 =Arrays.asList(5, 6, 7, 8, 13);
        System.out.println(numeros2);

        //Tem outra forma de chamar
        Collection<Integer> numeros3 = List.of(5, 6, 7, 8, 13);
        System.out.println(numeros3);

        //E mais outra...
        Collection<Integer> numeros4 = Set.of(5, 6, 7, 8, 13);
        System.out.println(numeros4);
    }
}
