package name1;

import java.util.Scanner;

public class plus2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int front = kb.nextInt();
        int back = kb.nextInt();
        int num = 0;
        while (num < back){
            num++;
            System.out.print(front);
            if (num < back){
                System.out.print(" + ");
            }
        }
        System.out.print(" = "+front*back);
    }
}
