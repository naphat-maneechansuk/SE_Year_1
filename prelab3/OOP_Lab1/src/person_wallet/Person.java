package person_wallet;

public class Person {
    String firstname;
    String lastname;
    Wal_let myWallet;
    Person(String firstname ,String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
        myWallet = new Wal_let();
    }
    int checkMoney() {
       return myWallet.getBalance();
    }
    void useMoney(int money){
        myWallet.getMoney(money);
    }
    void saveMoney(int money){
        myWallet.putMoney(money);
    }
    void changeNewWellet(Wal_let newwallet){
         newwallet = myWallet;
    }
    void printInfo(){
        System.out.println("Name : "+firstname+" "+lastname);
        System.out.println("Wallet : "+checkMoney());
    }
}
