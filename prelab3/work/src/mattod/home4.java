package mattod;

import java.util.Scanner;

public class home4 {
    public static  int factorial(int n){
        int total = 1;
        for (int i = n; i > 1; i--) {
            total *= i;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int total = factorial(n);
        System.out.print(total);
    }
}
