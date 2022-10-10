package threadLocal;

public class LocalUserThread extends Thread{
    @Override
    public void run() {
        int value = ThreadLocalSample.generateNumber();
        System.out.println(this.getName() + "  LocalUserThread Value = " + value);
        OtherLogic otherLogic = new OtherLogic();
        otherLogic.printMyNumber();
        ThreadLocalSample.remove();
    }

}
