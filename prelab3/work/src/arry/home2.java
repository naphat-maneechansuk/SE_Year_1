package arry;

import java.util.Scanner;

public class home2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int row = 0;
        int colume = 0;
        int matrix[][] = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = kb.nextInt();
            }
        }
        for (int i = 0; i < 3; i++) {
            if (matrix[i][0] == matrix[i][1] && matrix[i][0] == matrix[i][2]) {
                System.out.println("All " + matrix[i][0] + " on row " + i);
            }
        }
        for (int j = 0; j < 3; j++) {
            if (matrix[0][j] == matrix[1][j] && matrix[0][j] == matrix[2][j]) {
                System.out.println("All " + matrix[0][j] + " on column " + j);
            }
        }
//        if(matrix[0][0] == matrix[0][1] && matrix[0][2] == matrix[0][0]){
//            System.out.println("All "+matrix[0][0]+" on row 0");
//        }
//        if(matrix[1][0] == matrix[1][1] && matrix[1][2] == matrix[1][0]){
//            System.out.println("All "+matrix[1][0]+" on row 1");
//        }
//        if(matrix[2][0] == matrix[2][1] && matrix[2][2] == matrix[2][0]){
//            System.out.println("All "+matrix[2][0]+" on row 2");
//        }
//        if(matrix[0][0] == matrix[1][0] && matrix[0][0] == matrix[2][0]){
//            System.out.println("All "+matrix[0][0]+" on column 0");
//        }
//        if(matrix[0][1] == matrix[1][1] && matrix[0][1] == matrix[2][1]){
//            System.out.println("All "+matrix[0][1]+" on column 1");
//        }
//        if(matrix[0][2] == matrix[1][2] && matrix[0][2] == matrix[2][2]){
//            System.out.println("All "+matrix[0][2]+" on column 0");
//        }
    }
}
