package Chapter_11.caught;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Main {

    public static void main(String[] args) {
        setDefaultUncaughtExceptionHandler();
        test();
    }

    private static void test() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("子线程异常前");
                System.out.println(1 / 0);
            }
        }).start();
        System.out.println("当前线程异常前");
        System.out.println(1 / 0);
        System.out.println("异常后的代码不能执行了");
    }

    private static void setDefaultUncaughtExceptionHandler() {
        Thread.UncaughtExceptionHandler currentHandler = new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                System.out.println("【当前线程的Handler处理异常信息】" + t.toString() + "\n" + e.getMessage());
            }
        };
        Thread.UncaughtExceptionHandler defaultHandler = new Thread.UncaughtExceptionHandler() {
            @Override
            public void uncaughtException(Thread t, Throwable e) {
                StringWriter writer = new StringWriter();
                PrintWriter printWriter = new PrintWriter(writer);
                printWriter.write("start------------\n");
                e.printStackTrace(printWriter);
                printWriter.write("------------end");
                printWriter.close();
                System.out.println("【默认的Handler处理异常信息】" + writer.getBuffer().toString());
            }
        };
        Thread.currentThread().setUncaughtExceptionHandler(currentHandler);
        Thread.setDefaultUncaughtExceptionHandler(defaultHandler);
    }

}
