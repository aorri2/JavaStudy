package lambda;

@FunctionalInterface
interface Calculate{
    int operation(int a, int b);
}

public class CalculateLambda {
    public static void main(String[] args) {
                Calculate calculateSubtract = (a,b) -> a-b;
        System.out.println(calculateSubtract.operation(10,4));
        CalculateLambda sample = new CalculateLambda();
        sample.runCommonThread();
    }

    private void runCommonThread(){
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println(Thread.currentThread().getName());
//            }
//        };
//        new Thread(runnable).start();
        new Thread(()-> System.out.println(Thread.currentThread().getName())).start();
    }
}
