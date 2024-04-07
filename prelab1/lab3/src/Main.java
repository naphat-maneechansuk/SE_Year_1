
public class Main {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 4;
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;

        }
        System.out.println(num1);
    }
}