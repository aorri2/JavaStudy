package clazz;

public class Penguin {
    int speed = 10;

    void speedTest(){
        int speed = 20;

        System.out.println("speed = " + speed);
        System.out.println("this.speed = " + this.speed);
    }

    public static void main(String[] args) {
        Penguin pororo = new Penguin();
        pororo.speedTest();
    }


}
