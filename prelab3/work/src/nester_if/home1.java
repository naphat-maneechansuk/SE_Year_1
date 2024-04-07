package nester_if;

import java.util.Scanner;

public class home1 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int mark = (n*2)-1 ;
        int mark1 = 0 ;
        for (int i = 0 ; i < n ; i++){
            for (int k = 0 ; k < mark1 ; k++) {
                System.out.print("=");
            }
            for (int j = 0 ; j < mark ; j++){
                System.out.print("+");
                }
            for (int k = 0 ; k < mark1 ; k++) {
                System.out.print("=");
            }
            mark = mark - 2;
            mark1++;
            System.out.println();
        }
    }
}
