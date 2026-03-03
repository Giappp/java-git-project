package multithreading.threads;

public class EvenThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Even Thread");
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
