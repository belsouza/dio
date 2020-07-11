package Superaction;


import Paradigma.Carro;

public class Carros extends Veiculo {

    private int quantidadeDePortas;

    public boolean equals( Object obj ){
        if(obj == null){
            return false;
        }

        Carro g;
        if(obj instanceof Carro){
            g = (Carro) obj;
        }else{
            return false;
        }

        if(this.hashCode() == obj.hashCode()){
            return true;
        }
        return false;
    }

    /*
    @Override
    public int hashKode(){
        return Objects.hashCode(modelo, marca, valorvenal);
    }*/


    public Carros(String modelo, String marca, double valorVenal){
        super(modelo, marca, valorVenal);
    }

    public Carros( String modelo, String marca, double valorVenal, int quantidadeDePortas ){
        super( modelo, marca, valorVenal);
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public static void main(String[] args ){
        System.out.println("Hello World");
    }

}


