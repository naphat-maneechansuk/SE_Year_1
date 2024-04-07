import java.util.Scanner;

public class day_month_year2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int day = kb.nextInt();
        int month = kb.nextInt();
        int year = kb.nextInt();
        String leap_common ;
        if (year%4 != 0){
            leap_common ="common";
        }else if (year%100 != 0){
            leap_common = "leap";
        }else if (year%400 != 0){
            leap_common= "common";
        }else {
            leap_common= "leap";
        }
        if ((day >= 1 && day <= 31) && month == 1){
            System.out.println(day + " JAN " + year);
        }else if (month==2){
            if (leap_common == "common"){
                if (day <= 28){
                    System.out.println(day + " FEB " + year);
                }else {
                    System.out.println("Invalid");
                }
            }else if (leap_common =="leap"){
                if (day <= 29){
                    System.out.println(day + " FEB " + year);
                }else {
                    System.out.println("Invalid");
                }
            }
        }else  if ((day >= 1 && day <= 31) && month == 3){
            System.out.println(day + " MAR " + year);
        }else if ((day >= 1 && day <= 30) && month == 4){
            System.out.println(day + " APR " + year);
        }else if ((day >= 1 && day <= 31) && month == 5){
            System.out.println(day + " MAY " + year);
        }else if ((day >= 1 && day <= 30) && month == 6){
            System.out.println(day + " JUN " + year);
        }else if ((day >= 1 && day <= 31) && month == 7){
            System.out.println(day + " JUL " + year);
        }else if ((day >= 1 && day <= 31) && month == 8){
            System.out.println(day + " AUG " + year);
        }else if ((day >= 1 && day <= 30) && month == 9){
            System.out.println(day + " SEP " + year);
        }else if ((day >= 1 && day <= 31) && month == 10){
            System.out.println(day + " OCT " + year);
        }else if ((day >= 1 && day <= 30) && month == 11){
            System.out.println(day + " NOV " + year);
        }else if ((day >= 1 && day <= 31) && month == 12){
            System.out.println(day + " DEC " + year);
        }else {
            System.out.println("Invalid");
        }
    }
}