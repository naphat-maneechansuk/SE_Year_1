package X_y;

import java.util.Scanner;

public class Test_XY    {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Point p1 = new Point(1,1);
        Point p2 = new Point(5,5);
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        Line lineA = new Line(p1,p2);
        System.out.println("Line A : "+lineA.toString());
        System.out.printf("Distance : "+"%.2f",lineA.distance());
        System.out.println();
        p1.setLocation(2,2);
        System.out.println("Line A : "+lineA.toString());
        System.out.printf("Distance : "+"%.2f",lineA.distance());
        System.out.println();
        System.out.println("=================================");
        Line lineB = new Line(2,3,2,5);
        System.out.printf(lineB.toString()+"\n"+"Distance : "+"%.2f",lineB.distance());
        System.out.print("Input start point x and y : ");
        int stX = kb.nextInt();
        int stY = kb.nextInt();
        System.out.print("Input end point x and y : ");
        int eX = kb.nextInt();
        int eY = kb.nextInt();
        Line lineC = new Line(stX,stY,eX,eY);
        System.out.printf(lineC.toString()+"\n"+"Distance : "+"%.2f",lineC.distance());
        System.out.println();
        System.out.print("Lpngest line is line ");
        if (lineA.distance()>=lineB.distance()&&lineA.distance()>=lineC.distance()){
            System.out.print("LineA");
        }else if (lineB.distance()>=lineA.distance()&&lineB.distance()>=lineC.distance()){
            System.out.println("LineB");
        }else {
            System.out.println("LineC");
        }
    }

}
