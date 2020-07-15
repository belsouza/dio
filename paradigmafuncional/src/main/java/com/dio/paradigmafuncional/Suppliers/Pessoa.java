package com.dio.paradigmafuncional.Suppliers;

public class Pessoa {

    private String nome;
    private int idade;

    public Pessoa(){
        this.nome = "Pedro";
        this.idade = 55;
    }

    public Pessoa( String nome, int idade ){
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s | Idade: %d", nome, idade );
    }
}
