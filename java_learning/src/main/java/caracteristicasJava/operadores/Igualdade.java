package caracteristicasJava.operadores;

public class Igualdade {

  public static void main(String[] args) {

    //final var numero = 11 - Dont Works Java 14;
    final Integer numero = 11;

    if (numero == 10) {
      System.out.println("O número é 10");
    } else {
      System.out.println("O número  não é 10");
    }

    if (numero != 10) {
      System.out.println("O número não é 10");
    } else {
      System.out.println("O número é 10");
    }

    // final var letra = "B" -> Dont Works on Java 14 too
    // final Character letra = "B" -> Dont Works too

    final String letra = "B";

    if ("A".equals(letra)) {
      System.out.println("É a letra A");
    }

    if (!letra.equals("A")) {
      System.out.println("Não é a letra A");
    }
  }
}
