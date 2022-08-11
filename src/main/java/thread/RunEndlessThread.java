package thread;

public class RunEndlessThread {
    public static void main(String[] args) {
        RunEndlessThread runEndlessThread = new RunEndlessThread();
        EndlessThread endlessThread = new EndlessThread();
        endlessThread.start();
        System.out.println(endlessThread.getName());
    }
}
