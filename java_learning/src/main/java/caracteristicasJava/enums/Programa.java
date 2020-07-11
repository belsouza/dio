package caracteristicasJava.enums;

public class Programa {

    public static void main(String[] args) {
        //final TipoVeiculo tipoVeiculo = new TipoVeiculo() - ERROR;

        System.out.println(TipoDeVeiculo.TERRESTRE);
        System.out.println(TipoDeVeiculo.AQUATICO);

        System.out.println(TipoDeVeiculo.valueOf("AEREO"));

        for (TipoDeVeiculo type : TipoDeVeiculo.values()) {
            System.out.println("Tipo: "+type);
        }

        System.out.println("Codigo do Status CLOSE :" + StatusQuo.CLOSE.getCod());
        System.out.println("Texto do Status OPEN :" + StatusQuo.OPEN.getTexto());
    }
}
