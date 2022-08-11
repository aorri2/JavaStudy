package thread;

public class RunMultiThreads {
    public static void main(String[] args) {
        RunMultiThreads sample = new RunMultiThreads();
        sample.runMultiThread();
    }

    public void runMultiThread() {
        RunnableSample[] runnableSample = new RunnableSample[5];
        RunnableSample.ThreadSample[] threadSample = new RunnableSample.ThreadSample[5];
        for (int loop = 0; loop < 5; loop++) {
            runnableSample[loop] = new RunnableSample();
            threadSample[loop] = new RunnableSample.ThreadSample();

            new Thread(runnableSample[loop]).start();
            threadSample[loop].start();

        }
        System.out.println("RunMultiThreads.runMultiThread is ended");
    }
}
