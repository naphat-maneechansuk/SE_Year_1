package Employee;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        Employee e[] = new Employee[num];
        for (int i = 0; i < num; i++) {
            char type = kb.next().charAt(0);
            if (type == 'E') {
                String fName = kb.next();
                String lName = kb.next();
                int sala = kb.nextInt();
                String po = kb.next();
                e[i] = new Employee(fName, lName, sala, po);
            }else if (type == 'S'){
                String fName = kb.next();
                String lName = kb.next();
                int sal = kb.nextInt();
                String po = kb.next();
                int amount = kb.nextInt();
                e[i] = new SaleMan(fName, lName, sal, po,amount);
            }
        }
        for (int i = 0; i < e.length; i++) {
            System.out.println(e[i]);
        }
    }
}
