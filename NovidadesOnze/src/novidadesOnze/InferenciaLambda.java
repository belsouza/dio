package novidadesOnze;

import java.util.function.Function;

public class InferenciaLambda {
    public static void main(String[] args) {
        Function< Integer, Double> divporDois = (var numero) -> numero / 2.0;
        System.out.println( divporDois.apply(10));
    }
}
