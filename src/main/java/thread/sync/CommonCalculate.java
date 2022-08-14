package thread.sync;

public class CommonCalculate {
    private int amount;
    private int interest;

    private Object interestLock = new Object();
    private Object amountLock = new Object();

    public CommonCalculate() {
        amount = 0;
    }

    public void addInterest(int interest) {
        synchronized (interestLock) {
            this.interest = interest;
        }
    }

    public void plus(int value) {
        synchronized (amountLock) {
            amount += value;
        }
    }

    public void minus(int value) {
        synchronized (amountLock) {
            amount -= value;
        }
    }

    public int getAmount() {
        return this.amount;
    }

}
