package person_wallet;

public class Wal_let {
    int balance ;
    Wal_let(){balance = 0;}
    int getBalance(){
        return balance;
    }
    void putMoney(int money){
        balance+=money;
    }
    void getMoney(int money){
        balance-=money;
    }
}
