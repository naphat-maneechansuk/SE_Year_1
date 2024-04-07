package name1;

import java.util.Scanner;

public class Multiply {
    public static void main (String[] args){
        Scanner kb = new Scanner(System.in);
        int a = kb.nextInt();
        int b = 1;
       while (b<13){
           System.out.println(a+" x "+b+" = "+a*b);
           b++;
       }
    }
}
