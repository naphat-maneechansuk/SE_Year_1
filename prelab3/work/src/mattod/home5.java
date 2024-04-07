package mattod;

import java.util.Scanner;

public class home5 {
    public static int gcd(int x, int y){
        int result ;
        while (y != 0){
            result = y;
            y = x % y;
            x = result;
        }
        return x;
    }
    public static  int lcm(int x, int y){
        int LCM ;
        LCM = (x * y) / gcd(x,y);
        return LCM;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int x = kb.nextInt();
        int y = kb.nextInt();
        int gcd = gcd(x , y);
        int lcm = lcm(x , y);
        System.out.println(gcd);
        System.out.println(lcm);
    }
}
