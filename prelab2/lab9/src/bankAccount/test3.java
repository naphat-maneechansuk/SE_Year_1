package bankAccount;

import java.util.ArrayList;
import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        ArrayList<BankAccount> acc = new ArrayList<BankAccount>();
        System.out.print("Enter the number of BankAccount : ");
        int number = kb.nextInt();
        for (int i = 0; i < number; i++) {
            String accNo = kb.next();
            double balance = kb.nextDouble();
            acc.add(new BankAccount(accNo, balance));
        }
        for (int i = 0; i < number; i++) {
            System.out.println(acc.get(i).toString());
        }
        System.out.println("Enter the number of PiggyBank : "+number );

        PiggyBank[] piggyBank = new PiggyBank[2];
        for (int i = 0; i < 2; i++) {
            System.out.print("Enter size and number of deposit : ");
            int size = kb.nextInt();
            int deposit = kb.nextInt();
            piggyBank[i] = new PiggyBank(size);
            for (int j = 0; j < deposit; j++) {
                int typeMoney = kb.nextInt();
                int money = kb.nextInt();
                if(typeMoney == 1){
                    piggyBank[i].addOne(money);
                }
                else if(typeMoney == 5){
                    piggyBank[i].addFive(money);
                }
                else if(typeMoney == 10){
                    piggyBank[i].addTen(money);
                }
            }
            System.out.println("Total : " + piggyBank[i].getMeasure());
        }
    }

}
//package bankAccount;
//
//import java.util.Scanner;
//
//public class test3 {
//    public static void main(String[] args) {
//        Scanner keyboard = new Scanner(System.in);
//        System.out.print("Enter the number of piggyBank : ");
//        int number = keyboard.nextInt();
//        for (int i = 0; i < number ; i++) {
//            System.out.print("Enter size and number of deposit : ");
//            int size = keyboard.nextInt();
//            int round = keyboard.nextInt();
//            PiggyBank bank = new PiggyBank(size);
//            for (int j = 0; j < round; j++) {
//                int type = keyboard.nextInt();
//                int count = keyboard.nextInt();
//                if(type == 1){
//                    bank.addOne(count);
//                }
//                if(type == 5){
//                    bank.addfive(count);
//                }
//                if(type == 10){
//                    bank.addTen(count);
//                }
//            }
//            System.out.print("Total is : "+ bank.getMeasure());
//        }
//    }
//}
