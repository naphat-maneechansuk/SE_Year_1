package lab11_3;
import java.util.InputMismatchException;
import java.util.Scanner;
public class AccountTest {
    public static void main(String[] args) throws NegativeBalance {
        try {
            Scanner kb = new Scanner(System.in);
            System.out.print("Enter initial balance : ");
            BankAccount acc = new BankAccount(kb.nextDouble());
            System.out.println(acc);
        }catch (InputMismatchException ex){
            System.out.println("Your input invalid");
        }catch (NegativeBalance balance){
            String balanZ = String.valueOf(balance);
            System.out.println(balanZ.substring(25,balanZ.length()-2));
        }
    }
}
