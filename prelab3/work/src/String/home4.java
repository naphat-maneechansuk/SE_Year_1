package String;

import java.util.Scanner;

public class home4 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String sentence = kb.nextLine();
        String word = kb.next();
        int count = 0;
        String arrword[] = sentence.split("[., ]");
        for (int i = 0; i < arrword.length; i++) {
            if (word.equalsIgnoreCase(arrword[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}
