package operator;

public class TildeOperator {

    public static void main(String[] args) {
        TildeOperator sample = new TildeOperator();
        byte b = 127;
        sample.printTildeResult(b);
        b=1;
        sample.printTildeResult(b);
    }
    private void printTildeResult(byte b){
        System.out.println("original value = "+b);
        System.out.println("Tilde value = "+ ~b);
    }
}

