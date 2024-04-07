import java.util.Scanner;

public class parking_fee1 {
    public static void main(String[] args){
        Scanner kb = new Scanner(System.in);
        int min = kb.nextInt();
        int baht = kb.nextInt();
        int hour = min/60;
        int minute = min%60;
        if (minute > 0){
            hour = hour+1;
        }
        if (baht > 1000){
            System.out.println(hour = 0);
        }else if (baht >= 500 && baht <= 1000){
            if (hour > 2){
                System.out.println((hour-2)*10);
            }else {
                System.out.println(hour=0);
            }
        }else if (baht < 500&& baht > 1){
            if (hour > 1){
                System.out.println((hour-1)*15);
            }else {
                System.out.println(hour=0);
            }
        }else {
            System.out.println(hour*20);
        }
    }
}
