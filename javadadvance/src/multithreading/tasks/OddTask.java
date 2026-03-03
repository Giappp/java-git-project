package multithreading.tasks;

public class OddTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Odd Task");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
