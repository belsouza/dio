package caracteristicasJava.finals;

public class Programa {

    public static void main(String[] args) {

        final HardcoreGamer hardcoreGamer = new HardcoreGamer();
        final Gamer gamer = new Gamer();
        final CasualGamer casualGamer = new CasualGamer();
        //final var game = "PUBG" - Dont Works Java 14;
        final String game = "PUBG";
        //game = "WoW";

        System.out.println(casualGamer.play(game));


    }

}
