package Paradigma;

import java.util.Scanner;

public class Program {

    public static void main(String[] args ){

        int num;
        String[] temp;

        Scanner input = new Scanner(System.in);
        System.out.print("Entre com o tipo e a quantidade inicial de pessoas: ");
        temp = (input.nextLine()).split(" ");
        String tipo = temp[0];
        num = Integer.parseInt(temp[1]);

        Carro h = new Carro(tipo, num);
        h.limiteDoCarro();
    }
}
