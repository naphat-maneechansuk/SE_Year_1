package mixed_number;

import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n1 = kb.nextInt(), n2 = kb.nextInt(), n3 = kb.nextInt();
        Fraction fraction = new Fraction(n2,n3);
        MixedNumber mixedNumber = new MixedNumber(n1, fraction);
        mixedNumber.convertToFraction().print();
    }
}
