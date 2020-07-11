package caracteristicasJava.classes.pessoa;

import caracteristicasJava.classes.usuario.SuperUsuario;

public class ProgramaDoUsuario {

    public static void main(String[] args) {

        SuperUsuario batman = new SuperUsuario("batman", "123456789");
        //final var batman = new SuperUsuario("batman", "1234%$#@");

        batman.getLogin();

        //batman.getSenha();    //ERRO
        //String nomeDoCliente = batman.nome; //ERRO
    }

}
