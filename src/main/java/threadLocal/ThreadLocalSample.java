package threadLocal;

import java.util.Random;

public class ThreadLocalSample {
    private final static ThreadLocal<Integer> local = new ThreadLocal<>();
    private static Random random;
    static{
        random = new Random();;
    }
    public static Integer generateNumber(){
        int value = random.nextInt(45);
        local.set(value);
        return value;
    }

    public static void remove(){
        local.remove();
    }

    public static Integer get() {
        return local.get();
    }

    public static void main(String[] args) {
        ThreadLocalSample sample = new ThreadLocalSample();
        Thread thread = new LocalUserThread();
        thread.start();
        Thread thread1 = new LocalUserThread();
        thread1.start();

    }
}
