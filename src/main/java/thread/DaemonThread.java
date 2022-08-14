package thread;

public class DaemonThread extends Thread {

    @Override
    public void run() {
        try {
            sleep(Long.MAX_VALUE);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void runCommonThread() {
        DaemonThread thread = new DaemonThread();
        thread.start();
    }

    public void runDaemonThread() {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true);
        thread.start();
    }

    public static void main(String[] args) {
        DaemonThread thread = new DaemonThread();
        thread.runDaemonThread();
    }
}
