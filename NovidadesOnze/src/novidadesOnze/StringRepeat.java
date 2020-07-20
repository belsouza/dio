package novidadesOnze;

public class StringRepeat {

    public static void main(String[] args) {

        String animais = "Zebra, Camelo, Elefante, Javali, Suricate, Leão, Guepardo";
        var nomes = animais.split(", ");
        for (String temp: nomes) {
            System.out.println(temp.repeat(10));;
        }

    }
}
