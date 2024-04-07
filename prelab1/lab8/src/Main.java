import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        Student a[] = new Student[num];
        for (int i = 0; i < num; i++) {
            int id = kb.nextInt();
            String name = kb.next();
            double gpa = kb.nextDouble();
            a[i] = new Student(id,name,gpa);
        }
        for (int i = 0; i < num; i++) {
            System.out.println(a[i].getName()+ " ("+ a[i].getType()+") "+a[i].checkStatus());
        }
    }
}