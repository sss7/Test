package test;

public class ClockManager
{
    static boolean isClockRun = true;
    public static void main(String[] args) throws Throwable {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        Thread.sleep(10000);
        System.out.println("main: after sleeping...");
        isClockRun = false;
        System.out.println("main: end");
    }
}

class Clock implements Runnable {
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                e.printStackTrace();
            }

            System.out.println("Tik");

            if (!ClockManager.isClockRun)
                return;
        }
    }
}