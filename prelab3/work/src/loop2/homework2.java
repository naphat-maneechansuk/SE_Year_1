package loop2;

import java.util.Scanner;

public class homework2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a = 0;
        if (n%10==0){
            while (n>=a){
                System.out.print(n+" ");
                n -= 10;
            }
        }else {
            int b ;
            b = n%10;
            n = n-b ;
            while (n>=a) {
                System.out.print(n + " ");
                n -= 10;
            }
        }
    }
}
