package caracteristicasJava.fors;

import java.util.stream.IntStream;

public class For {

  public static void main(String[] args) {

    int i, x;
    for (i = 0; i <= 10; i = i + 1) {
      System.out.print("[i = " + i + "] ");
    }
    System.out.println();

    for (x = 0; x <= 5; x++){
      System.out.print("[x = " + x + "] ");
    }
    System.out.println();


    IntStream.of( 1, 2, 3, 4, 5, 6).forEach(n -> {  System.out.print("|" + n + "| ");  });
    System.out.println();

    IntStream.range(0, 10).forEach(n ->{ System.out.print("[n:" + n + "] ");  });
    System.out.println();

  }

}
