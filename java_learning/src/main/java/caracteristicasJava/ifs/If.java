package caracteristicasJava.ifs;

public class If{

  public static void main(String[] args) {

    // final var condicao = false; - Not Works on Java 14
    final Boolean condicao = false;

    if (condicao) {
      System.out.println("The condition is True");
    } else {
      System.out.println("The condition is False");
    }

    if (condicao)
      System.out.println("The only line...");

    //final var ternario = condicao ? "is true" : "is false"; - Dont't  Works
    final String ternario = condicao ? "is true" : "is false" ;

    System.out.println(ternario);
  }
}
