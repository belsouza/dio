package Excecoes;

//in java lang

import java.security.AccessControlException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.Scanner;

public class Chopper {
    //exemplo de fluxo de tratamennto de exceções em um  fluxo
    public static void checker( String filename ){
        try{
            new java.io.FileInputStream(filename);
        }catch (java.io.FileNotFoundException e){
            System.out.println("Nao achei o arquivo para leitura.");
        }
    }
    //Nao esperado NullPointException
    public static void uncheckedException(){
        try{
            ArrayList<String> u = new ArrayList( 5 );
            u.add(1, "dasdasdasd");

        }catch( EmptyStackException e ){  //IntegrationException e
           // throw new BusinessException("Erro na criacao do objeto");
        }
    }


    public static void rechonchudo(Connection con, String query) throws SQLException {
        try{
            PreparedStatement stmt = con.prepareStatement(query);
        }catch (SQLException e){
            throw new AccessControlException("Problema na criacao do Statement");
        }
        finally {
            con.close();
        }
    }

    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Entre com o nome do arquivo e o caminho:");
        String troll = input.nextLine();
        checker(troll);
    }
}
