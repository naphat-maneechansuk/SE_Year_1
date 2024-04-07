package home_work;

import java.util.Scanner;

public class Tester_6 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int num1 = kb.nextInt();
        int deno1 = kb.nextInt();
        int num2= kb.nextInt();
        int deno2= kb.nextInt();
        Fraction first = new Fraction(num1,deno1);
        Fraction second = new Fraction(num2,deno2);
        System.out.println(first.isEqual(second));
    }
}
