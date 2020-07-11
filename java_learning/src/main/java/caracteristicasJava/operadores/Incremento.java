package caracteristicasJava.operadores;

public class Incremento {

  public static void main(String[] args) {

    //var numero = 1; -> Dont Works
    int numero = 1;

    System.out.println(++numero);

    //var variavel = 10; -> Dont Works
    Integer variavel = 10;

    System.out.println(variavel--);
    System.out.println(variavel);
  }
}
