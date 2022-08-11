package exception;

public class FinallySample {
    public static void main(String[] args) {
        FinallySample finallySample = new FinallySample();
        finallySample.finallySample();
    }
    public void finallySample(){
        int[] arr = new int[4];
        try{
            System.out.println(arr[5]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.err.println(e.getMessage());
        }finally {
            System.out.println("여기는 반드시 실행 되어야 합니당!");
        }
        System.out.println("이 코드도 실행 될걸요?");
    }

}
