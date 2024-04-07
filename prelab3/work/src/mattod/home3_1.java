package mattod;

import java.util.Scanner;

public class home3_1 {
    public static int sum_even(int x , int y){
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int total = 0;
        for (int i = min; i <= max; i++) {
            if (i%2 == 0){
                total += i;
            }
        }
        return total;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        int total = sum_even(m,n);
        System.out.println(total);
    }
}
