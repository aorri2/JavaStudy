package generic;

class Car {
    protected String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "car{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Bus extends Car{
    public Bus(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                '}';
    }
}
public class CarWildcardSample {
    public static void main(String[] args) {
        CarWildcardSample sample = new CarWildcardSample();
        sample.callBusBoundedWildcardMethod();

    }

    private void callBoundedWildcardMethod() {
        WildcardGeneric<Car> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Car("Tesla"));
        boundedWildcardMethod(wildcard);
    }
    private void callBusBoundedWildcardMethod() {
        WildcardGeneric<Bus> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard(new Bus("300번"));
        boundedWildcardMethod(wildcard);
    }

    private void boundedWildcardMethod(WildcardGeneric<? extends Car> c) {
        Car value = c.getWildcard();
        System.out.println(value);
    }
}
