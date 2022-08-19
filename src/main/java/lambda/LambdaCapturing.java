package lambda;

import java.util.Arrays;

public class LambdaCapturing {
    private int a = 12;

    public void test(){
        int b = 123;

        final Runnable runnableA = () -> System.out.println(a);
        final Runnable runnableB = () -> System.out.println(b);
        runnableA.run();
        runnableB.run();
    }

    public static void main(String[] args) {
        LambdaCapturing lambdaCapturing = new LambdaCapturing();
        lambdaCapturing.test();
        String[] stringArray = { "Barbara", "James", "Mary", "John",
                "Patricia", "Robert", "Michael", "Linda" };
        Arrays.sort(stringArray,String::compareToIgnoreCase);
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
