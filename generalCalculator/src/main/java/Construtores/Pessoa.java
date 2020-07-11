package Construtores;

public class Pessoa {

    private String nome;
    private final String datadenascimento;

    public Pessoa( String nome, String datadenascimento ){
        this.nome = nome;
        this.datadenascimento = datadenascimento;
    }

    public Pessoa( String nome, int dia, int mes, int ano ){
        this.nome = nome;
        this.datadenascimento = dia + "/" + mes + "/" + ano;
    }

    public String getDatadenascimento() {
        return datadenascimento;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    private void returndatanascimento(){
        String[] p = (this.nome).split("/");
        int dia = Integer.parseInt(p[0]);
        int mes = Integer.parseInt(p[1]);
        int ano = Integer.parseInt(p[2]);
        System.out.println( dia + mes + ano );
    }

    public void getIdade(){
        this.returndatanascimento();
    }

}
