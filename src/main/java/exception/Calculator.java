package exception;

public class Calculator {
    public static void main(String[] args) {
        try {
            Calculator.printDivide(1, 2);
            Calculator.printDivide(1, 0);
        } catch (DivideByZeroException e) {
            e.getMessage();
        }

    }

    public static void printDivide(double d1, double d2) throws DivideByZeroException {

            if (d2 == 0) {
                throw new DivideByZeroException();
            }
            double result = d1 / d2;
            System.out.println(result);



    }

    private static class DivideByZeroException extends Throwable {
        DivideByZeroException() {
            super();
        }

    }
}
