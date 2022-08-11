package clazz;

public class CarManager {

    public static void main(String[] args) {
        Car wooksCar = new Car();
        Car jongsCar = new Car();

        wooksCar.speedUp();
        System.out.println(wooksCar.speed);
    }
}
