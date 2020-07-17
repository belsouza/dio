package ParallelSync;

import java.util.concurrent.FutureTask;

public class Tester {

    public static void main(String[] args) {
        FutureTask<String> morg = new FutureTask<>(String::new);
        morg.isDone();
    }
}
