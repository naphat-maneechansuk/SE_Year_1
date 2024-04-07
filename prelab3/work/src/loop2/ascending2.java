package loop2;

import java.util.Scanner;

public class ascending2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        int kg;
        int n = 0;
        int max = 0, min = 0;
        double total = 0;
        while (n < num) {
            System.out.print("Input amount of person " + "[ " + (n+1) + " ]" + " : ");
            kg = kb.nextInt();

            if (n == 0) {
                max = kg;
                min = kg;
            }else if (kg>max){
                max = kg;
            }else if (kg<min){
                min = kg;
            }
            n++;
            total += kg ;
        }
        System.out.println("=== Processing ===");
        System.out.println("Max weight : "+max);
        System.out.println("Min weight : "+min);
        System.out.print("Average weight : ");
        System.out.printf("%.2f",(total/n));
    }
}