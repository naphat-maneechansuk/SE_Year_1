package String;

import java.util.Scanner;

public class home1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String search = kb.next();
        String building = null ;
        String floor = null;
        String room = null;
        switch (search.substring(0,2)){
            case "SC" :
                building = "Science Building";
                break;
            case "IF" :
                building = "Informatics Building";
                break;
            case "EN" :
                building = "Engineering Building";
                break;
        }floor = search.substring(2,3);
        room = search.substring(3,5);
        System.out.println(building+"\n"+"Floor "+floor+"\n"+"Room "+room);
    }
}
