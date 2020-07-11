package caracteristicasJava.abstracts;

public class Programa {

    public static void main(String [] args )
    {
        final FormaGeometrica square = new Quadrado("square", 10.0);

        System.out.println(square);

        System.out.println(square.desenha(12,34));
        System.out.println("Nome da forma geometrica: " + square.nome());
        System.out.println("Area total: " + square.area());
    }
}
