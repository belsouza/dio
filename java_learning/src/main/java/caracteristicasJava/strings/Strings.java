package caracteristicasJava.strings;

import java.lang.*;

public class Strings {

  public static void main(String[] args) {

    String nome = "Silvana";
    String sobrenome = "Pereira";
    final String ncompleto = nome + " " + sobrenome;

    System.out.println(nome);
    System.out.println("Primeiro Nome: " + nome);
    System.out.println("Nome completo : " + ncompleto);
    String string = new String(" Minha String ");

    System.out.println("Char pos : " + string.charAt(5));
    System.out.println("Quantidade = " + string.length());
    System.out.println("Sem Trim [" + string + "]");
    System.out.println("Com Trim [" + string.trim() + "]");
    System.out.println("Lower " + string.toLowerCase());
    System.out.println("Upper " + string.toUpperCase());
    System.out.println("Contem M? " + string.contains("M"));
    System.out.println("Contem X? " + string.contains("X"));
    System.out.println("Replace " + string.replace("n", "$"));
    System.out.println("Equals? " + string.equals(" Minha String "));
    System.out.println("EqualsIgnoreCase? " + string.equalsIgnoreCase(" MINHA StrinG "));
    System.out.println("Substring(1,6)=" + string.substring(1, 6));

    String ffjones = "Memes for all things";

    char[] foo = ffjones.toCharArray();
    for (char c: foo ){
      System.out.print("[" + c + "] ");
    }
    System.out.println();

    String[] foosec = ffjones.split(" ");
    for (String d: foosec ) {
      System.out.print("[" + d + "]");
    }
    System.out.println();

    System.out.println("Concat: " + ffjones.concat(" and events"));
    System.out.println( ffjones.replaceAll("[a-f]", "fl" ));
  }
}
