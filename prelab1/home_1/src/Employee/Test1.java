package Employee;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        Employee e[] = new Employee[num];
        for (int i = 0; i < num; i++) {
            String fName = kb.next();
            String lName = kb.next();
            int sal = kb.nextInt();
            String po = kb.next();
            e[i] = new Employee(fName,lName,sal,po);
        }
        int per = kb.nextInt();
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i].toString());
        }
        System.out.println("After update salary");
        for (int i = 0; i < e.length; i++) {
            e[i].upSalary(per);
            System.out.println(e[i]);
        }
    }
}
