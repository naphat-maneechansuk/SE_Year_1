package lab11_3;

public class NegativeBalance extends Exception{
    public NegativeBalance() {
        super("Error: Negative starting balance");
    }
    public NegativeBalance(double amount) {
        super("Error: Negative starting balance: "+ amount);
    }
}
