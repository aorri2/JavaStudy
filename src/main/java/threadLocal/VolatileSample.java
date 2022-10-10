package threadLocal;

public class VolatileSample extends Thread{
   private double instanceVariable = 0;

    void setDouble(double value){
        this.instanceVariable = value;
    }
    @Override
    public void run() {
        try {
        while(instanceVariable == 0){
            Thread.sleep(1);
        }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(instanceVariable);

    }
}
