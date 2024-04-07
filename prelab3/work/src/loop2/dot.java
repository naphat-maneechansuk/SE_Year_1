package loop2;

import java.util.Scanner;

public class dot {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        System.out.print("Input : ");
        int n = kb.nextInt();
        int a = 0;
        System.out.print("Output: ");
        if (n>0){
            System.out.print(n+" ");
            while (a < n){
                System.out.print('*');
                a++;
            }
        }else {
            System.out.println(n);
        }
    }
}
