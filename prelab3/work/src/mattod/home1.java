package mattod;

import java.util.Scanner;

public class home1 {
    public static void square (int m , int n){
        char arry[][] = new char[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == 0 || i == m-1 || j == n-1){
                    arry[i][j] = '*';
                }else {
                    arry[i][j] = ' ';
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arry[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int m = kb.nextInt();
        int n = kb.nextInt();
        square(m , n);
    }
}
