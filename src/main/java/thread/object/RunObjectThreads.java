package thread.object;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads sample = new RunObjectThreads();
        sample.checkThreadState3();
    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor);
        try {
            System.out.println("thread.getState() = " + thread.getState());
            thread.start();
            System.out.println("thread State(after start) = " + thread.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread.getState());

            synchronized (monitor) {
//                monitor.notify();
                monitor.notifyAll();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread.getState());

            thread.join();
            System.out.println("thread state(after join)=" + thread.getState());

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void checkThreadState3() {
        Object monitor = new Object();
        StateThread thread1 = new StateThread(monitor);
        StateThread thread2 = new StateThread(monitor);
        try {
            System.out.println("thread.getState() = " + thread1.getState());
            thread1.start();
            thread2.start();
            System.out.println("thread State(after start) = " + thread1.getState());

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) = " + thread1.getState());

            synchronized (monitor) {
                monitor.notifyAll();
            }
            Thread.sleep(100);
            System.out.println("thread state(after notify) = " + thread1.getState());

            thread1.join();
            System.out.println("thread state(after join)=" + thread1.getState());

            thread2.join();
            System.out.println("thread2 state(after join)=" + thread2.getState());

        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
