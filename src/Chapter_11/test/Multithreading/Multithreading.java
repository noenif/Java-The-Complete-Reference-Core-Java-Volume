package Chapter_11.test.Multithreading;



public class Multithreading {

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Runnable r = () -> {

                try {


                    System.out.println(Thread.currentThread());
                    Thread.sleep(1000);


                } catch (InterruptedException e) {
                }
            };
            var t = new Thread(r);
            t.start();
        }
        ;

    }
}

