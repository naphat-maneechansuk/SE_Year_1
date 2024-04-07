package name1;

import java.util.Scanner;

public class plus {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int number = 1;
        int set = 0;
        int n = kb.nextInt();
        while (number<=n){
            set+=number;
            number++;
        }
        System.out.println(set);
    }
}
