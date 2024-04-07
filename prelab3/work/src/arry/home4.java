package arry;
import java.util.Scanner;
public class home4 {
        public static void main(String[] args) {
            Scanner kb = new Scanner(System.in);
            int m = kb.nextInt();
            int n = kb.nextInt();
            boolean True = false;
            int arey[][] = new int[m][n];
            for (int i = 0; i < arey.length; i++) {
                for (int j = 0; j < arey[i].length; j++) {
                    arey[i][j] = kb.nextInt();
                }
            }
            int x = kb.nextInt(), y = kb.nextInt();
            if (x == 0 || y == 0) {
                if (x == 0) {
                    if (arey[x][y - 1] == 1 && arey[x][y + 1] == 1) {
                        True = true;
                    }
                } else if (y == 0) {
                    if (arey[x - 1][y] == 1 && arey[x + 1][y] == 1) {
                        True = true;
                    }
                }
            }else {
                if (arey[x - 1][y] == 1 && arey[x + 1][y] == 1) {
                    True = true;
                } else if (arey[x][y - 1] == 1 && arey[x][y + 1] == 1) {
                    True = true;
                } else {
                    True = false;
                }
            }
            System.out.println(True);
        }
    }



