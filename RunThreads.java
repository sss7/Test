package test;

public class RunThreads implements Runnable{
    public static void main(String[] args) {
        RunThreads runner = new RunThreads();
        Thread alpha = new Thread(runner);
        Thread beta = new Thread(runner);
//        alpha.setName("alpha thread");
//        beta.setName("beta thread");
        alpha.start();
        beta.start();
    }

    public void run() {
        for (int i = 0; i < 9; i++) {
            String threadName = Thread.currentThread().getName();
            System.out.println("The " + threadName + " is working");
        }
    }
}
