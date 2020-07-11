package caracteristicasJava.abstracts;

public abstract class FormaGeometrica {

    public abstract String nome();
    public abstract Double area();

    public String desenha(int x , int y) {
        return "Coordenadas x =" + x + " e y = " + y;
    }
}

