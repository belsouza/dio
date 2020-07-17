package ParallelSync;


public class ThreadsExemploDois {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Richards());
        Thread t2 = new Thread(new Pororoca());

        //t1.run();
        //t2.run();

        t1.start();
        t2.start();

        System.out.println(t1.getName());
        System.out.println(t2.getName());

    }
}

class Richards implements Runnable{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Corre Richard!...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Pororoca extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(5000);
            System.out.println("Pororoca...");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}



