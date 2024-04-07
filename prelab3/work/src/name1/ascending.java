package name1;

import java.util.Scanner;

public class ascending {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int front = kb.nextInt();
        int back = kb.nextInt();
        if (front<=back){
            while (front<=back){
                if ((front%2)==0){
                    System.out.print(front+" ");
                }
                front++;
            }
        }else if (back<=front){
            while (back<=front){
                if ((back%2)==0){
                    System.out.print(back+" ");
                }
                back++;
            }
        }else if (front==back){
            if ((front%2)==0){
                System.out.println(front);
            }
        }
    }
}
