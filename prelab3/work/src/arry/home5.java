package arry;

import java.util.Scanner;

public class home5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char arey[][] = {{' ', '_', ' '}, {'|', '_', '|'}, {'|', '_', '|'}};
        int n[][] = new int[3][3];
        for (int i = 0; i < arey.length; i++) {
            for (int j = 0; j < arey.length; j++) {
                if (i == 0 && j == 0 || i == 0 && j == 2) {
                    continue;
                }
                n[i][j] = kb.nextInt();
            }
        }
        for (int i = 0; i < arey.length; i++) {
            for (int j = 0; j < arey[i].length; j++) {
                if (n[i][j] == 1) {
                    System.out.print(arey[i][j]);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
