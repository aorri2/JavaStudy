package thread.practice;

public class TimerMain {
    public static void main(String[] args) {
        TimerMain main = new TimerMain();
        TimerThread thread = new TimerThread();
        thread.start();
    }
}
