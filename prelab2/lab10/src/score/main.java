package score;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args)throws IOException {
        File f = new File("D:\\java\\lab 1\\lab10\\src\\score\\score.txt");
        Scanner kb = new Scanner(f);
        String s[] ;
        while (kb.hasNext()){
            s = kb.nextLine().split(" ");
            char pass = ' ';
            if (Integer.parseInt(s[1]) >= 60){
                pass = 'S';
            }else {
                pass = 'U';
            }
            System.out.println("ID : "+ s[0]+" Grade : "+pass);
        }
    }
}
