package Chapter_11.test.Multithreading;



public class Multithreading
{

    public static void main(String[] args)
    {




            Runnable r = () -> {
                try {
                    for (int i = 0; i < 100; i++) {
                        System.out.println(Thread.currentThread());
                        Thread.sleep(1000);

                    }
                }
                catch (InterruptedException e)
                {
                }
            };
            var t = new Thread(r);
            t.start();
        }
    }

