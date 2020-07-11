package Comparators;

//Interface para definir regra de ordenacao em uma classe de dominio

public class Estudante implements Comparable<Estudante> {

    private final String nome;
    private final Integer idade;

    public Estudante(String nome, Integer idade){
        this.nome = nome;
        this.idade = idade;
    }

    public Integer getIdade(){  return idade;  }

    public String getNome(){ return nome;  }

    public String toString() { return "|" + nome + " -- " + idade + "| ";  }

    @Override
    public int compareTo(Estudante o) {
        return this.getIdade() - o.getIdade();
    }
}
