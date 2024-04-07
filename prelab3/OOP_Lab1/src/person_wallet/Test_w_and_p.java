package person_wallet;

public class Test_w_and_p {
    public static void main(String[] args) {
        Person jame =new Person("Jame","Smith");
        jame.printInfo();
        System.out.println();

        System.out.println("save money 1000");
        jame.saveMoney(1000);
        jame.printInfo();
        System.out.println();

        System.out.println("use money 200");
        jame.useMoney(200);
        jame.printInfo();
        System.out.println();

        System.out.println("change wallet");
        Wal_let chap =new Wal_let();
        jame.changeNewWellet(chap);
        jame.printInfo();
        System.out.println();
    }
}
