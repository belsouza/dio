package caracteristicasJava.enums;

public enum StatusQuo {

    OPEN(13, "Aberto"),
    CLOSE(02, "Fechado");

    private int codigo;
    private String texto;

    StatusQuo(final int codigo, final String texto) {

        this.codigo = codigo;
        this.texto = texto;
    }

    public int getCod() {
        return codigo;
    }

    public String getTexto() {
        return texto;
    }
}
