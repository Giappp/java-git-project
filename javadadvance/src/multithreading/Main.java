package multithreading;

import multithreading.tasks.EvenTask;
import multithreading.tasks.OddTask;
import multithreading.threads.EvenThread;
import multithreading.threads.OddThread;

public class Main {
    public static void main(String[] args) {
        EvenThread evenThread = new EvenThread();
        OddThread oddThread = new OddThread();

        evenThread.start();
        oddThread.start();

        Runnable evenTask = new EvenTask();
        Runnable oddTask = new OddTask();

        Thread threadWithEvenTask = new Thread(evenTask);
        Thread threadWithOddTask = new Thread(oddTask);

        threadWithEvenTask.start();
        threadWithOddTask.start();

        System.out.println("Main Thread ended");
    }
}
