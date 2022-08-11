package thread;

public class EndlessThread extends Thread{
    @Override
    public void run() {
        int count= 0;
        while(true){
            try{
                count++;
                System.out.println(count);
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
