package text;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\java\\lab 1\\lab10\\src\\text\\text.txt");
        Scanner kb = new Scanner(f);
        PrintWriter outFile = new PrintWriter(new File("D:\\java\\lab 1\\lab10\\src\\text\\revtext.txt"));
        while (kb.hasNext()){
            char c[] = kb.nextLine().toCharArray();
            String re = "";
            for (int i = c.length-1; i >= 0; i--) {
                re += c[i];
            }
            outFile.println(re);
        }
        outFile.close();
    }
}
