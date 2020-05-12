package Chapter_11.Create_a_thread;

public class Main {
    public static void main(String args[]) {
        new NewThread(); // create a new thread

        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                System.out.println(Thread.currentThread().isInterrupted());

                Thread.sleep(1000);
                Thread.currentThread().interrupt();
            }
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }
        System.out.println("Main thread exiting.");
    }
}
