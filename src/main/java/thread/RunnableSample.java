package thread;

public class RunnableSample implements Runnable {

    public static void main(String[] args) {
        RunThreads runThreads = new RunThreads();
        runThreads.runBasic();

    }
    @Override
    public void run() {
        System.out.println("RunnableSample.run");
    }

    static class ThreadSample extends Thread {
        @Override
        public void run() {
            System.out.println("ThreadSample.run");
        }
    }

    static class RunThreads {


        public void runBasic() {
            RunnableSample runnableSample = new RunnableSample();
            new Thread(runnableSample).start();

            ThreadSample threadSample = new ThreadSample();
            threadSample.start();
            System.out.println("RunThreads.runBasic() method is ended");


        }
    }
}
