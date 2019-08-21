package threads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceRunner {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(new Task1());
        executorService.execute(new Thread(new Task2()));

        System.out.println("task3 kicked off");

        //Task3
        for (int i =301; i<399; i++)
            System.out.println(i+ " ");
        System.out.println("\n Task3 Done");

        System.out.println("\n Main Done");
        executorService.shutdown();

    }
}
