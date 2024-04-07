package String;

import java.util.Scanner;

public class home5 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String rabdad = kb.next();
        String rabmom = kb.next();
        String rabby = kb.next();
        int count_x = 0;
        for (int i = 0; i < rabdad.length(); i++) {
            if (rabby.charAt(i) == rabdad.charAt(i)){
                System.out.print('F');
            }else if (rabby.charAt(i) == rabmom.charAt(i)){
                System.out.print('M');
            }else {
                System.out.print('X');
                count_x++;
            }
        }
        System.out.println();
        if (count_x > 1){
            System.out.println("NO");
        }else {
            System.out.println("YES");
        }
    }
}
