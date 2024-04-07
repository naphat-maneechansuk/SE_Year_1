package student2;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args)throws IOException {
        File f = new File("D:\\java\\lab 1\\lab10\\src\\student2\\student2.txt");
        Scanner kb = new Scanner(f);
        String s[];
        while (kb.hasNext()){
            s = kb.nextLine().split(" ");
            char name = s[1].charAt(0);
            double score = Double.parseDouble(s[3]);
            String pass = null;
            if (score >= 2){
                pass = "Pass";
            }else if (score>=1&&score<2){
                pass = "Critical";
            }else {
                pass = "Retired";
            }
            System.out.println(s[0]+" " +name+". "+s[2]+" "+pass);
        }
        kb.close();
    }
}
