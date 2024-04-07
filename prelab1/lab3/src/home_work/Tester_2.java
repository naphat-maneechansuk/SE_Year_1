package home_work;

import java.util.Scanner;

public class Tester_2 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        Fraction f = new Fraction(num1,num2);// 2,4
        f.makeNewFormat();// 1,2
        f.makeNewFormat().print();
    }
}
