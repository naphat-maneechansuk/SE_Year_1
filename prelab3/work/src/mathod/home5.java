package mathod;

import java.util.Scanner;

public class home5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt() , n = kb.nextInt();
        int total = mul(m , n);
        System.out.print(total);
    }
    public static int mul(int m , int n){
        if (n == 1){
            return m;
        }else {
            return m+mul(m , n-1);
        }
    }
}
