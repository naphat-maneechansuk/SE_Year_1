package home_work;

import java.util.Scanner;

public class Tester_3 { public static void main(String[] args) {
    Scanner kb =new Scanner(System.in);
    int num1 = kb.nextInt();
    int num2 = kb.nextInt();
    Fraction f = new Fraction(num1,num2);
    num1 = kb.nextInt();
    num2 = kb.nextInt();
    Fraction f1 =new Fraction(num1,num2);
    f.multiply(f1).makeNewFormat().print();
    }
}
