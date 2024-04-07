import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int temperature = kb.nextInt();
        char mark =kb.next().charAt(0);
        if (mark == 'C'){
            if (temperature < 1){
                System.out.println("Solid");
            }else if (temperature >= 100){
                System.out.println("Gas");
            }else{
                System.out.println("Liquid");
            }
        }else {
            if (temperature < 33){
                System.out.println("Solid");
            }else if (temperature >= 212){
                System.out.println("Gas");
            }else{
                System.out.println("Liquid");
            }
        }
    }
}