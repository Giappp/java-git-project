package multithreading.threads;

public class OddThread extends Thread {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Odd Thread");
        for (int i = 1; i <= 20; i += 2) {
            System.out.println(i);
        }
    }
}
