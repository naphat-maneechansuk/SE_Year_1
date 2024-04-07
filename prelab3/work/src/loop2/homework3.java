package loop2;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int a = 0;
        if (n%2==0){
            while (a<n){
                System.out.print("* ");
                a++;
            }
        }else {
            while (a<n) {
                System.out.print("+ ");
                a++;
            }
        }
    }
}
