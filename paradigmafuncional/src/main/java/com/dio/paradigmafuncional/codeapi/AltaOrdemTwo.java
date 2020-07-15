package com.dio.paradigmafuncional.codeapi;

@FunctionalInterface //Interface com apenas uma funcao para se criar uma lambda
interface Calculo{
    //Warning:(5, 5) Modifier 'public' is redundant for interface methods
    int calcular(int a, int b);
}

public class AltaOrdemTwo {

    public static void main(String[] args){
        int num1 = 20, num2 = 5;

        //Calculo soma = (a, b) -> a + b;   //Lambda can be replaced with method reference
        Calculo soma = Integer::sum;
        Calculo subracao = (a, b) -> a - b;
        Calculo multi = (a, b) -> a * b;
        Calculo div = (a, b) -> a / b;

        try{
            System.out.println(makeOperation(soma, num1, num2));
            System.out.println(makeOperation(subracao, num1, num2));
            System.out.println(makeOperation(multi, num1, num2));
            System.out.println(makeOperation(div, num1, num2));
        }
        catch (Exception e){
            System.out.println("Erro: " + e);
        }
    }

    public static int makeOperation( Calculo calculo, int a, int b ){
        return calculo.calcular(a, b);
    }
}
