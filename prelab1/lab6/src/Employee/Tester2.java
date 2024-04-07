package Employee;

import java.util.Scanner;

public class Tester2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        System.out.println("Enter number of person : ");
        int gobbet = kb.nextInt();
        Employee employee[] = new Employee[gobbet];
        for (int i = 0; i < gobbet; i++) {
            System.out.print("Enter information of person ("+(i+1)+") : "+"\n"
            +"Enter type of person : ");
            int type = kb.nextInt();
            if (type == 1){
                System.out.print("Enter Employee information (1) [name salary] : ");
                String name = kb.next();
                int monny = kb.nextInt();
                Employee e = new Employee(name,monny);
                employee[i] = e;
            }else if (type == 2){
                System.out.print("Enter Sale information (1) [name salary commission] : ");
                String name = kb.next();
                int monny = kb.nextInt();
                int commission = kb.nextInt();
                Sales s = new Sales(name,monny,commission);
                employee[i] = s;
            }else if (type == 3) {
                System.out.print("Enter Manager information (1) [name salary parkNo] : ");
                String name = kb.next();
                int monny = kb.nextInt();
                String parkingNo = kb.next();
                Manager m = new Manager(name,monny,parkingNo);
                employee[i] = m;
            }else if (type == 4) {
                System.out.print("Enter Programmer  information (1) [name salary OT] : ");
                String name = kb.next();
                int monny = kb.nextInt();
                int ot = kb.nextInt();
                System.out.print("Enter number of programming language : ");
                int numLanguage = kb.nextInt();
                String language[] = new String[numLanguage];
                for (int j = 0; j < numLanguage; j++) {
                    System.out.print("Enter name of lang ("+j+") : ");
                    language[j] = kb.next();
                }
                Programer p = new Programer(name,monny,language,ot);
                employee[i] = p;
            }
        }
        System.out.println("<=== The detail of each person ===>");
        for (int i = 0;i < employee.length ; i++){
            System.out.println(employee[i].toString());
        }
    }
}
