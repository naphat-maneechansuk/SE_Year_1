package loop2;

import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n ;
        int no = 0;
        int a = 0;
        while (true) {
            n = kb.nextInt();
            if (n == 25) {
                break;
            } else {
                no++;
            }
        }
        while (a<no){
            System.out.println("no");
            a++;
        }
        System.out.println("yes "+(no+1));
    }
}
