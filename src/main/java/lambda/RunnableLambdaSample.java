package lambda;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class RunnableLambdaSample {
    private static void runCommonThread() {
        new Thread(() -> System.out.println(Thread.currentThread().getName())).start();
    }

    public static void main(String[] args) {
        runCommonThread();
        UnaryOperator<Integer> func2 = x -> x * 2;
        System.out.println(func2.apply(2));
    }
}
