package CalculadoraImc;

import javax.swing.*;

public class Programa {

    private static String filteritstring( String num ){
        if (num.contains(",")){  return num.replace(",", ".");  }
        return num;
    }


    public static void main( String[] args ){

        String npeso, naltura, mensagem;
        double peso, altura;
        npeso = JOptionPane.showInputDialog("Entre com o peso: ");
        naltura = JOptionPane.showInputDialog("Entre com a altura: ");

        peso = Double.parseDouble(npeso);
        altura = Double.parseDouble(  filteritstring(naltura) );
        SetIMC n = new SetIMC(peso, altura);
        mensagem = n.getIndiceMass();

        JOptionPane.showMessageDialog( null, mensagem );
    }

}




