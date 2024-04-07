package home_4.home_4_1;

import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        char type = kb.next().charAt(0);
        if (type == 'R'){
            double width = kb.nextDouble();
            double length = kb.nextDouble();
            Rectangle r = new Rectangle(width,length);
            System.out.printf("%.2f",r.area());
        }else if (type == 'T'){
            double base = kb.nextDouble();
            double height = kb.nextDouble();
            Triangle t = new Triangle(base,height);
            System.out.printf("%.2f",t.area());
        }
    }
}
