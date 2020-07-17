package ParallelSync;

public class ThreadsExemploTres {
    public static void main(String[] args) {
        GeneratedPDF test = new GeneratedPDF();
        LoadingBar started = new LoadingBar( test );
        test.start();
        started.start();
    }
}

class GeneratedPDF extends Thread{
    @Override
    public void run() {
        try {
            System.out.println("Start convertion to PDF...");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finished! ");
    }
}

class LoadingBar extends Thread{

    private Thread startLoadingBar;

    public LoadingBar( Thread startLoadingBar ){
        this.startLoadingBar = startLoadingBar;
    }

    @Override
    public void run(){

        while(true){
            try{
                Thread.sleep(500);
                if(!startLoadingBar.isAlive()){
                    break;
                }
                System.out.println("Loading...");

            }catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
