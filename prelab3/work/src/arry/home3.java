package arry;

import java.util.Scanner;

public class home3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String type = "1";
        int a = 0, b = 0;
        char matrix[][] = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = kb.next().charAt(0);
                if (matrix[i][j] == '0') {
                    a++;
                }
                if (matrix[i][j] == '1') {
                    b++;
                }
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (matrix[i][j] == 'X') {
                    continue;
                }
                if (matrix[i][j] != '1') {
                    type = "0";
                }

            }
        }
        if (a >= 1) {
            if (a > b) {
                type = "0";
            } else if (a < b) {
                type = "X";
            }
        }
        if (matrix[1][0] == '0' && matrix[1][2] == '0') {
            type = "0";
        }

        System.out.print(type);
    }
}
