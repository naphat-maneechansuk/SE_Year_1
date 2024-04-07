package String;

import java.util.Scanner;

public class home2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String input = kb.next();
        int num = 0;
        String check1 = null;
        String check2 = "1";
        for (int i = 0; i < input.length(); i++) {
            check1 = input.substring(i, i + 1);
            if (!check1.equals(check2)) {
                if (i > 0) {
                    System.out.print(num + check2);
                }
                check2 = check1;
                num = 0;
            }
            num++;
        }
        System.out.print(num + check2);
    }
}
