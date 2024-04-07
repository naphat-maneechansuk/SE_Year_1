import java.util.Scanner;




public class Main1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("=== Program discount price ===");
        System.out.print("Input status of member : ");
        char identity = kb.next().charAt(0);
        System.out.print("Input price : ");
        int rates = kb.nextInt();
        System.out.println("=== Calculate total price ===");
        System.out.print("Total Price : ");
        if (identity == 'Y'){
            if (rates > 500){
                if (rates <= 1000){
                    rates = rates - (rates*3)/100;
                }else if (rates <= 2000){
                    rates = rates - (rates*4)/100;
                }else if (rates <= 5000){
                    rates = rates - (rates*7)/100;
                }else if (rates > 5000){
                    rates = rates - (rates*10)/100;
                }

                }else {
                rates = rates;
            }
        }else {
            if (rates > 1000){
                if (rates <= 2000){
                    rates = rates - (rates*3)/100;
                }else if (rates <= 5000){
                    rates = rates - (rates*3)/100;
                }else if (rates >5000){
                    rates = rates - (rates*7)/100;
                }
            }else {
                rates = rates;
            }
        }
        System.out.println(rates);
    }
}