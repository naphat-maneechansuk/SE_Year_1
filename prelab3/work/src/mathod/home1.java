package mathod;

import java.util.Scanner;

public class home1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int num[] = new int[n] ;
        for (int i = 0 ; i < n ;i++){
            num[i] = kb.nextInt();
        }
        printOnlyGreaterValue(num , average(num));
    }
    public static double average(int[] arr){
        int num = 0;
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
            num++;
        }
        double value = total/num;
        return value;
    }
    public static void printOnlyGreaterValue(int[] arr, double value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > value) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
