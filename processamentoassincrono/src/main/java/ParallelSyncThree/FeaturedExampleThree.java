package ParallelSyncThree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

interface Atividade{
    void realizar() throws InterruptedException;
}

public class FeaturedExampleThree {

    private static final ExecutorService pessoasParaExecutarAtividade = Executors.newFixedThreadPool(3);

    public static void main(String[] args) throws InterruptedException {
        Casa casa = new Casa(new Quarto());
        List<? extends Future<?>> futuros = casa.obterAfazeresDaCasa().stream()
                .map(atividade -> pessoasParaExecutarAtividade.submit(() -> {
                    try {
                        atividade.realizar();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                })).collect(Collectors.toCollection(CopyOnWriteArrayList::new));

        while(!futuros.stream().allMatch(Future::isDone))
        {
            int numeroDeAtividadesNaoFinalizadas = 0;
            for(Future<?> futuro : futuros){
                if(futuro.isDone()){
                    try{
                        System.out.println("Parabens! Voce terminou de " + futuro.get());
                    }catch (InterruptedException | ExecutionException e){
                        e.printStackTrace();
                    }
                }
                else{
                    numeroDeAtividadesNaoFinalizadas += 1;
                }
            }
            System.out.println("Numero de atividades nao finalizadas: " + numeroDeAtividadesNaoFinalizadas);
            Thread.sleep(500);
        }
        pessoasParaExecutarAtividade.shutdown();
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

class Quarto extends Comodo{

    @Override
    List<Atividade> obterAfazeresDoComodo() {
        return Arrays.asList(
                this::getArrumarCama,
                this::varrerQuarto,
                this::arrumarGuardaRoupa
        );
    }

    private String arrumarGuardaRoupa() throws InterruptedException {
        Thread.sleep(5000);
        //System.out.println("Arrumar o guarda roupa ");
        return  "Arrumar o guarda roupa";
    }

    private String varrerQuarto() throws InterruptedException{
        Thread.sleep(5000);
        //System.out.println("Varrer o quarto ");
        return "Varrer o quarto ";
    }

    private String getArrumarCama() throws InterruptedException {
        Thread.sleep(5000);
        //System.out.println("Arrumar a cama");
        return "Arrumar a cama";
    }
}


