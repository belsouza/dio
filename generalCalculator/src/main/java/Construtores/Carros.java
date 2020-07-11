package Construtores;

public class Carros {

    private final String marca;
    private final String modelo;
    private final int ano;
    private final String variante;

    public Carros( String marca, String modelo, int ano, String variante ){
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.variante = variante;
    }

    public int getAno() {
        return ano;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getVariante() {
        return variante;
    }
}
