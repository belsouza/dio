package caracteristicasJava.whiles;

public class While {

  public static void main(String[] args) {

    int i = 0;

    //Testa a condição antes
    while (i < 1) {
      System.out.println("Dentro do while...");
      i++;
    }

    int y = 0;
    //Testa a condição depois
    do {
      System.out.println("Dentro do do/while...");
    } while (y ++< 1);
  }

}
