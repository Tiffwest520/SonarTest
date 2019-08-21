package threads;

/// extending the thread class
class Task1 extends Thread {
    public static void MAX_PRIORITY(int i) {
    }

    @Override
    public void run() {
        System.out.println("Task1 started");
        for (int i =101; i<199; i++)
            System.out.println(i+ " ");
        System.out.println("\n Task1 Done");
    }
}

class  Task2 implements Runnable{

    @Override
    public void run() {
        System.out.println("\nTask2 started");
        for (int i =201; i<299; i++)
            System.out.println(i+ " ");
        System.out.println("\nTask2 Done");

        System.out.println("task3 kicked off");
    }
}


public class ThreadBasicRunner {

    public static void main(String[] args) throws InterruptedException {
        //Task1
        System.out.println("task1 kicked off");
        Task1 task1 = new Task1();
        Task1.MAX_PRIORITY(10);
        task1.start(); // starts a new one

        System.out.println("task2 kicked off");

        //Task2
        Task2 task2 = new Task2();
        Thread task2thread = new Thread(task2);
        task2thread.start();



        //wait for task1 to complete
        task1.join();
        task2thread.join();


        System.out.println("task3 kicked off");

        //Task3
        for (int i =301; i<399; i++)
            System.out.println(i+ " ");
        System.out.println("\n Task3 Done");

        System.out.println("\n Main Done");


    }

}
