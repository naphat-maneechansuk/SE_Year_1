package mathod;

import java.util.Scanner;

public class home4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        int nup = 0 ;
        char arr[][] = new char[m][n];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = kb.next().charAt(0);
                if (arr[i][j] == '$'){
                    nup++;
                }
            }
        }
        if (nup > (m*n)/2){
            yes(arr);
        }else {
            no(arr);
        }
    }
    public static void yes(char arr[][]){
        int colume , row ;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i%2 == 0 || j == 1 || (j%3 == 0 && j != 0)){
                    arr[i][j] = 'x';
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void no(char arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == 0 || i == arr.length-1 || j == 0 || j == arr[i].length-1){
                    arr[i][j] = '+';
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
