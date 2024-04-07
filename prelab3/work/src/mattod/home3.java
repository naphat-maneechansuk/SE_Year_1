package mattod;

import java.util.Scanner;

public class home3 {
    public static int sum_even(int x , int y){
        int min = Math.min(x, y);
        int max = Math.max(x, y);
        int total = 0;
        for (int i = min; i <= max; i++) {
            if (is_even(i)){
                total += i;
            }
        }
        return total;
    }
    public static boolean is_even(int number){
        boolean is_even = true;
        if (number%2 != 0){
            is_even = false;
        }
        return is_even;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        int total = sum_even(m,n);
        System.out.println(total);
    }
}
