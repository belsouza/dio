package caracteristicasJava.operadores;

public class Logicos {

  public static void main(String[] args) {

    // final var numero = 2; and  final var letra = "A"; Dont Works
    final int numero = 2;
    final String letra = "A";

    //Sort Circuit
    if (numero < 5 && letra.equals("A")) {
      System.out.println("Condition Satisfied");
    }

    if (numero < 5 || letra.equals("A")) {
      System.out.println("Other Condition Satisfied");
    }

    if ((10 - 5) > 1 && (5 - 3) > 1) {
      System.out.println("Crazy Logic...");
    }

    testeme( false );
  }

  private static void testeme( boolean resposta ){
    if(resposta){
         //Non Sort Circuit
        if (verifica(15) || verifica("A")) {
            System.out.println("OK");
        } else {
            System.out.println("Não OK");
        }
    }
  }

  private static boolean verifica(String letra) {
    System.out.println("Verificando letra...");
    return letra.equals("A");
  }

  private static boolean verifica(Integer numero) {
    System.out.println("verificando numero...");
    return numero > 10;
  }
}
