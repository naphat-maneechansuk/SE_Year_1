package mixed_number;

import java.util.Scanner;

public class Tester3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        MixedNumber total = new MixedNumber();
        for (int i = 0; i < n; i++) {
            char mF = kb.next().charAt(0);
            if (mF == 'M') {
                int n1 = kb.nextInt();
                int n2 = kb.nextInt();
                int n3 = kb.nextInt();
                MixedNumber mixedNumber = new MixedNumber(n1, new Fraction(n2, n3));
                total = total.add(mixedNumber);
            } else if (mF == 'F') {
                int n1 = kb.nextInt();
                int n2 = kb.nextInt();
                Fraction f = new Fraction(n1, n2);
                total = total.add(f);
            }
        }
       //char type = kb.next().charAt(0);
        //if (type == 'M') {
            total.makeNewFormat().print();
        //}else if (type =='F'){
          //  total.convertToFraction().print();
        //}
        }
}
