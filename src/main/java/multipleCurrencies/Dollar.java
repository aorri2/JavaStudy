package multipleCurrencies;

public class Dollar {
    public int amount;

    public Dollar(int dollar) {
        amount = dollar;
    }

    public void times(int multiplier) {
        this.amount *= multiplier;
    }
}
