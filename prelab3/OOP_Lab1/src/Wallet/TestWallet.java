package Wallet;

public class TestWallet {
    public static void main(String[] args) {
        Wallet w = new Wallet();
        System.out.println("I have new wallet");
        w.getMyMonny();
        w.putMonny(500);
        System.out.println("I Would like to eating buffet (use 200 bath)");
        w.getMonny(200);
        System.out.println("I am going to see movie at cinema (use 170 bath)");
        w.getMonny(170);
        System.out.println("I would like to eating buffet (use 200 bath)");
        w.getMonny(200);
    }
}
