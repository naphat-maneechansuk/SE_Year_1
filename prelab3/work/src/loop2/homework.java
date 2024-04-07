package loop2;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = kb.nextInt();
        int total = 0;
        while (a<=b){
            if (a%2!=0){
                System.out.print(a+" ");
                total += a;
            }
            a++;
        }
        System.out.println("");
        System.out.println(total);
    }
}
