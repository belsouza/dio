package ParallelSyncTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

interface Atividade{
    void realizar();
}

public class FeaturedExample {

    private static final ExecutorService threadPool = Executors.newFixedThreadPool(3);

    public static void main(String[] args) {
        Casa casa = new Casa(new Quarto());
        casa.obterAfazeresDaCasa().forEach( atividade -> threadPool.execute(atividade::realizar));
        threadPool.shutdown();
    }
}

class Casa{
    private List<Comodo> comodos;

    Casa(Comodo... comodos){
        this.comodos = Arrays.asList(comodos);
    }

    List<Atividade> obterAfazeresDaCasa(){
        return this.comodos.stream().map( Comodo::obterAfazeresDoComodo)
                .reduce(new ArrayList<>(), (pivo, atividades) -> {
                    pivo.addAll(atividades);
                    return pivo;
                });
    }

}

abstract class Comodo{
    abstract List<Atividade> obterAfazeresDoComodo();
}

class Quarto extends Comodo {

    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(
            this::getArrumarCama,
            this::varrerQuarto,
            this::arrumarGuardaRoupa
        );
    }

    private void arrumarGuardaRoupa() {
        System.out.println("Arrumar o guarda roupa ");
    }

    private void varrerQuarto(){
        System.out.println("Varrer o quarto ");
    }

    private  void getArrumarCama() {
        System.out.println("Arrumar a cama");
    }
}


