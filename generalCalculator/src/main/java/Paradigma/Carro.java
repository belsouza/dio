package Paradigma;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Carro {

    private int quantidade;
    private final String tipo;
    private int remanescentes = 0;

    public Carro( String tipo, int quantidade ){
        this.quantidade = quantidade;
        this.tipo = tipo;
    }

    private boolean hasContent( TiposdeCarros car , int num ) throws Exception {

        String[] u = car.getCarName();
        int[] z = car.numberOfSeats();

        List<String> carro = Arrays.asList(u);
        int index = 0;
        //Se nao tem o carro, o valor nao esta cadastrado
        if (carro.contains(this.tipo)) {
            index = carro.indexOf(this.tipo);
            //Se a qte eh maior, a lotacao foi excedida
            if (z[index] > this.quantidade) {
                this.remanescentes = (z[index] - this.quantidade);
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            throw new Exception("Veiculo nao Encontrado. ");
        }
    }

    public void limiteDoCarro(){

        TiposdeCarros car = new TiposdeCarros();
        Scanner input = new Scanner(System.in);

         int num = this.quantidade;
         try{
             if(hasContent(car, num)){
                 if(this.remanescentes > 0){
                     System.out.println("Esse veiculo tem " + this.remanescentes + " lugares ainda. Deseja incluir mais pessoas? (S/N)");

                     try{
                         char option = input.next().charAt(0);


                         if(option == 'S' || option == 's'){
                                adicionar();
                         }
                         else if (option == 'N' || option == 'n'){
                                System.out.println("Veiculo agendado com sucesso!");
                         }
                         else
                         {
                             System.out.println("Nao reconheco esta opcao!");
                         }

                     }catch (Exception e){
                         System.err.println("Erro: " + e );
                     }


                 }

             }
             else
             {
                 throw new Exception("Lotacao excedida para este veiculo.");
             }
         }
         catch( Exception e ){
            System.err.println(e.getMessage());
        }
    }

    private void adicionar(){
        this.quantidade = this.quantidade + 1;
    }
    private void remover(){
        this.quantidade = this.quantidade - 1;
    }
}




