package test;

public class ThreadTest implements Runnable {
    public static void main(String[] args) {
        ThreadTest test = new ThreadTest();
        Thread thread = new Thread(test);
        thread.start();
        try {
            System.out.println("<1>");
            Thread.sleep(1000);
            System.out.println("<2>");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("<3>");
        thread.interrupt();
    }

    @Override
    public void run() {
        Thread current = Thread.currentThread();

        try {
            while (!current.isInterrupted()) {
                System.out.println("run...");
                Thread.sleep(250);
            }
        } catch (InterruptedException e) {
            System.out.println("stop.......");
        }


    }
}
