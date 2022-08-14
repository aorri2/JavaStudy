package thread.practice;

import java.util.Date;

public class TimerThread extends Thread {
    @Override
    public void run() {
        printCurrentTime();
    }

    public void printCurrentTime() {
        for (int loop = 0; loop < 10; loop++) {
            try {
                Thread.sleep(1000L);
                long currentTimeMillis = System.currentTimeMillis();
                System.out.println(new Date().toString() + currentTimeMillis);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
}
