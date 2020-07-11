package caracteristicasJava.tipos.naoprimitivos;

public class Unboxing {

    public static void main(String[] args) {

       //  int i = new Integer(3); Deprecated
        // int inteiro = Integer.valueOf(1024); Deprecated
        //boolean b = new Boolean(true);

        boolean b2 = Boolean.TRUE;
        boolean b3 = Boolean.getBoolean("false");

        System.out.println("Values of B2: " + b2 + " and B3: "+ b3);

    }

}
