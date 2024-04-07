package lab11_1;

import java.util.InputMismatchException;
import java.util.Scanner;
    public class Ex1 {

        public static void main(String[] args) {
            int[] numbers = {1, 2, 3};
            try {
                Scanner kb = new Scanner(System.in);
                System.out.print("Enter index of array : ");
                int n = kb.nextInt();
                System.out.println(numbers[n]);
            }catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Array index is out of bound");
            }catch (InputMismatchException ex2){
                System.out.println("Your input mismatch");
            }
        }
    }
