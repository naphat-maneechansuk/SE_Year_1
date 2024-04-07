package Wallet;

public class Wallet {
    int myMonny;
    Wallet(){ myMonny = 0;}
     void setMyMonny(int n){ myMonny = n;}
     void getMyMonny(){System.out.println("Current wallet have : " + myMonny + " Bath");}
     void putMonny(int n){
        myMonny += n;
         System.out.println("I put " + n + " bath to wallet");
         System.out.println("Current wallet have : "+myMonny+" Bath");
    }
    void getMonny(int n){
        if ((myMonny-n) <= 0 ){
            System.out.println("Can't get monny, because you monny not enough");
            System.out.println("Your monny in wallet : "+myMonny);
            System.out.println("Current     wallet have : "+myMonny+" Bath");
        }else {
            myMonny -= n;
            System.out.println("Your get monny "+n+" Bath");
            System.out.println("Current wallet have : "+myMonny+" Bath");
        }
    }
}
