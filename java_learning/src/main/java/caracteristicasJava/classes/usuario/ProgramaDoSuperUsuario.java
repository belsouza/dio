package caracteristicasJava.classes.usuario;

public class ProgramaDoSuperUsuario {

    public static void main( String[] args ){

        // final var su = new SuperUsuario("root", "fooJones");
        SuperUsuario su = new SuperUsuario("root", "fooJones");
        su.getLogin();

        su.getSenha();

        String root = su.nome;

    }


}
