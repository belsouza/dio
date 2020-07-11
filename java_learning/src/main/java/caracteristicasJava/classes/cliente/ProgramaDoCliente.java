package caracteristicasJava.classes.cliente;

public class ProgramaDoCliente {

    public static void main(String[] args) {

        // Don't works on Java 14
        // final var cliente = new Cliente(18);
        Cliente cliente = new Cliente(18);
        cliente.getIdade();

        cliente.getPeso();

        //System.out.println(cliente.relatorio());
    }

}
