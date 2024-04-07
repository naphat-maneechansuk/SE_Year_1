package home_work;

import java.util.Scanner;

public class Tester_5 {
    public static void main(String[] args) {
        Scanner kb =new Scanner(System.in);
        int n = kb.nextInt();
        int num1 = kb.nextInt();
        int num2 = kb.nextInt();
        Fraction first = new Fraction(num1,num2);
        if (n==1){
            first.makeNewFormat();
        }else {
            for (int i = 1; i < n; i++) {
                String notation = kb.next();
                int num3 = kb.nextInt();
                int num4 = kb.nextInt();
                Fraction second = new Fraction(num3, num4);
                if (notation.equals("add")) {
                    first = first.add(second);
                } else if (notation.equals("minus")) {
                    first = first.minus(second);
                }else if (notation.equals("mul")){
                    first = first.multiply(second);
                }else if (notation.equals("div")){
                    first = first.divide(second);
                }
            }
        }
        first.makeNewFormat().print();
    }
}
