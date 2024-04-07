package box;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle();
        System.out.print("Enter length of R1: ");
        double n1 = kb.nextInt();
        System.out.print("Enter width of R1: ");
        double n2 = kb.nextInt();
        r1.setDimension(n1,n2);
        System.out.print("Enter length of R2: ");
        double n3 = kb.nextInt();
        System.out.print("Enter length of R2: ");
        double n4 = kb.nextInt();
        r2.setDimension(n3,n4);
        System.out.println("Rectangle: width = "+ n2+" length = "+n1);
        System.out.println("Rectangle: width = "+ n4+" length = "+n3);
        System.out.println("Area of R1 = "+r1.area()+" Area of R2 = "+r2.area());
        if (r1.area()>r2.area()){
            System.out.println("R1 is bigger than R2");
        }else if (r1.area()<r2.area()){
            System.out.println("R1 is smaller than R2");
        }else if (r1.area()==r2.area()){
            System.out.println("R1 is equal to R2");
        }
        Box b1 = new Box();
        Box b2 = new Box();
        System.out.print("Enter [width, length, depth] of B1: ");
        n1 = kb.nextInt();
        n2 = kb.nextInt();
        n3 = kb.nextInt();
        b1.setDimension(n1,n2,n3);
        System.out.print("Enter [width, length, depth] of B2: ");
        n1 = kb.nextInt();
        n2 = kb.nextInt();
        n3 = kb.nextInt();
        b2.setDimension(n1,n2,n3);
        System.out.println("Box width : "+b1.width+" length : " + b1.length + " depth : "+ b1.depth);
        System.out.println("Box width : "+b2.width+" length : " + b2.length + " depth : "+ b2.depth);
        System.out.println("Volumn of B1 = "+ b1.volumn()+" Volumn of B2 = "+ b2.volumn());
        if (b1.volumn()>b2.volumn()){
            System.out.println("B1 is bigger than B2");
        }else if (b1.volumn()<b2.volumn()){
            System.out.println("B1 is smaller than B2");
        }else if (b1.volumn()==b2.volumn()){
            System.out.println("B1 is equal to B2");
        }
    }
}

