package thread;

import static thread.RunnableSample.ThreadSample;

public class RunDaemonThreads {
    public static void main(String[] args) {
        RunDaemonThreads sample = new RunDaemonThreads();
        sample.checkThreadProperty();
    }

    public void checkThreadProperty() {
        ThreadSample thread1 = new ThreadSample();
        ThreadSample thread2 = new ThreadSample();
        ThreadSample daemonThread = new ThreadSample();


        System.out.println("thread1 = " + thread1.getId());
        System.out.println("thread2 = " + thread2.getId());

        System.out.println("thread1.getName() = " + thread1.getName());
        System.out.println("thread2.getName() = " + thread2.getName());

        System.out.println("thread1 = " + thread1.getPriority());

        daemonThread.setDaemon(true);
        System.out.println("thread1.isDaemon() = " + thread1.isDaemon());
        System.out.println("daemonThread.isDaemon() = " + daemonThread.isDaemon());

    }
}
