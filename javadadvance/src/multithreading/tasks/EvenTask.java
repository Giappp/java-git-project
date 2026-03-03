package multithreading.tasks;

public class EvenTask implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Even Task");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
