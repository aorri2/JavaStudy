package thread.group;

import thread.support.SleepThread;

public class RunGroupThreads {
    public static void main(String[] args) {
        RunGroupThreads sample = new RunGroupThreads();
        sample.groupThread();
    }

    public void groupThread(){
        try{
            SleepThread sleep1 = new SleepThread(5000);
            SleepThread sleep2 = new SleepThread(5000);

            ThreadGroup group = new ThreadGroup("Group1");
            Thread thread1 = new Thread(group, sleep1);
            Thread thread2 = new Thread(group, sleep2);

            thread1.start();
            thread2.start();
            Thread.sleep(1000);
            System.out.println("group.getName()= " + group.getName());
            int activeCount = group.activeCount();
            System.out.println("activeCount = " + activeCount);
            group.list();

            Thread[] tempThreadList = new Thread[activeCount];
            int result = group.enumerate(tempThreadList);
            System.out.println("Enumerate result = " + result);
            for (Thread thread : tempThreadList) {
                System.out.println(thread);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
