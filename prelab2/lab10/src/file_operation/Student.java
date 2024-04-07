package file_operation;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Student {
    public static void main(String[] args) throws IOException {
        File f = new File("D:\\java\\lab 1\\lab10\\src\\file_operation\\student.txt");
        Scanner kb = new Scanner(f);
        String word[];
        int it = 0;
        int cs = 0;
        int se = 0;
        while (kb.hasNext()){
            word = kb.nextLine().split(" ");
            if(word[1].equalsIgnoreCase("CS")){
                cs++;
            }else if (word[1].equalsIgnoreCase("IT")){
                it++;
            }else if (word[1].equalsIgnoreCase("SE")){
                se++;
            }
        }
        kb.close();
        System.out.println("There are " + cs + " persons in Computer Science.\n" +
                "There are " + it + " persons in Information Technology.\n" +
                "There are " + se + " persons in Software Engineering.");
    }
}
