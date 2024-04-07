package mathod;

import java.util.Scanner;

public class home2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int answer[] = {1,2,3,4,1,2,3,4,1,2,};
        for (int i = n; i > 0 ; i--) {
            int score = 0;
            for (int j = 0; j < answer.length; j++) {
                int num = kb.nextInt();
                if (num == answer[j]){
                    score++;
                }
            }
            Score(score);
        }
    }
    public static void Score(int n){
        System.out.println(n);
    }
}
