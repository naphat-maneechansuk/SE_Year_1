package mattod;

import java.util.Scanner;

public class home2 {
    public static boolean is_even(int number){
        boolean is_even = true;
        if (number%2 != 0){
            is_even = false;
        }
        return is_even;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int number = kb.nextInt();
        boolean is_even = is_even(number);
        if (is_even == true){
            System.out.print("even");
        }else {
            System.out.print("odd");
        }
    }
}
