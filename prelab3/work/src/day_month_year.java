import java.util.Scanner;

public class day_month_year {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int year = kb.nextInt();
        if (year%4 != 0){
            System.out.println("common year");
        }else if (year%100 != 0){
            System.out.println("leap year");
        }else if (year%400 != 0){
            System.out.println("common year");
        }else {
            System.out.println("leap year");
        }

    }
}