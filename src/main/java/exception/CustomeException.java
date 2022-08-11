package exception;

public class CustomeException {

    public static void main(String[] args) {
        CustomeException sample = new CustomeException();
        try {
            sample.throwMyException(13);
        } catch (MyException e) {
            e.printStackTrace();
        }
    }

    public void throwMyException(int number) throws MyException{
        try{
            if(number > 12){
                throw new MyException("Number is over than 12");
            }
        }catch (MyException e){
            e.printStackTrace();
        }
    }
}
class MyException extends Exception{
    public MyException() {
        super();
    }
    public MyException(String message){
        super(message);
    }
}
