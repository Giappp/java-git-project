package multithreading;

import multithreading.tasks.EvenTask;
import multithreading.tasks.OddTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ExecutorDemo {
    public static void main(String[] args) {
        System.out.println("Starting");
        try (ExecutorService executorService = Executors.newFixedThreadPool(3)) {
            executorService.execute(new EvenTask());
            executorService.execute(new OddTask());
            executorService.execute(() -> {
                System.out.println(Thread.currentThread().getName() + " another task");
                for (int i = 1; i <= 20; i += 4) {
                    System.out.println(i);
                }
            });

            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Main thread end");
    }
}
