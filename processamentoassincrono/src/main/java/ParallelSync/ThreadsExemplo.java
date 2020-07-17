package ParallelSync;


public class ThreadsExemplo {
    public static void main(String[] args) {

        //Executa Runnable
        BancoDeCarregamento p1 = new BancoDeCarregamento();
        p1.run();
        //Executa Threads
        BancoDeCarregamentoTerceiraVersao p2 = new BancoDeCarregamentoTerceiraVersao();
        p2.start();
    }
}

class pickup implements Runnable{
    public void run() {
        System.out.println("Gerar Doces!");
    }
}

class BancoDeCarregamento implements Runnable{
    public void run() {

        try {
            Thread.sleep(5000);
            System.out.println("Running TV...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class BancoDeCarregamentoSegundaVersao extends Thread{

    public void run() {
        super.run();

        try {
            Thread.sleep(5000);
            System.out.println("Running SV..." + this.getName());
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

class BancoDeCarregamentoTerceiraVersao extends Thread{

    public void run() {
        super.run();

        try {
            Thread.sleep(5000);
            System.out.println("Running TV..." + this.getName());
        }
        catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}

