package home_work;

import java.util.Scanner;

public class Tester_4 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int n = kb.nextInt();
        Fraction first = new Fraction(0,1);
        for (int i = 0; i < n; i++) {
            int num1 = kb.nextInt();
            int num2 = kb.nextInt();
            Fraction second = new Fraction(num1,num2);
            second = second.minus(first);
            first = second;
        }
        first.makeNewFormat().print();
    }
}
