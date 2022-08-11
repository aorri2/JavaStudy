package exception;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample.throwable();
    }

    public static void throwable() {
        int[] arr = new int[5];
        try {
            arr = null;
            System.out.println(arr[5]);
        } catch (Throwable t) {
            System.out.println(t.getMessage());
            System.out.println(t.toString());
            t.printStackTrace();
        }
    }
}
