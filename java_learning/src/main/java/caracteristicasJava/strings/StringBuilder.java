package caracteristicasJava.strings;


public class StringBuilder {

  public static void main(String[] args) {

    //var nome = "Andre" - var went to the bag here too;
    String nome = "Carl";

    // final var builder = new java.lang.StringBuilder(nome); - have a problem

   java.lang.StringBuilder builder = new java.lang.StringBuilder(nome);
    //StringBuilder builder  = new StringBuilder(nome) - Not works too
    System.out.println(builder.append("Johnson"));

    final java.lang.StringBuilder reverse = builder.reverse();
    System.out.println(reverse);

    final java.lang.StringBuilder insert = reverse.insert(0, "#").insert(reverse.length(), "#");
    System.out.println(insert);
  }

}
