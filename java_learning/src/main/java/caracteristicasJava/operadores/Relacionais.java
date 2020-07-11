package caracteristicasJava.operadores;

public class Relacionais {

  public static void main(String[] args) {

   // final var numero = 6; -Var not recognized
    final int numero = 6;

    if (numero > 20) {
      System.out.println("The number is bigger than 20");
    } else if (numero >= 10) {
      System.out.println("The number is bigger or equal to 10");
    } else if (numero <= 5) {
      System.out.println("The number is less or equal to 5");
    } else {
      System.out.println("None of the previous");
    }
  }
}
