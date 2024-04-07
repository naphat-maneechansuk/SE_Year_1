package loop2;

import java.util.Scanner;

public class homework5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        char a ;
        int loop = 0;
        int num = 0;
        while (loop<n){
            a = kb.next().charAt(0);
            if (a=='A'||a=='E'||a=='I'||a=='O'||a=='U'){
                num++;
            }
            loop++;
        }
        System.out.println(num);
    }
}
