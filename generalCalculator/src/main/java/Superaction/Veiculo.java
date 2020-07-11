package Superaction;

import java.util.Objects;

public abstract class Veiculo {

    private String modelo;
    private String marca;
    private double valorvenal;

    public Veiculo( String modelo, String marca, double valorvenal )
    {
        this.modelo = modelo;
        this.marca = marca;
        this.valorvenal = valorvenal;
    }



}
