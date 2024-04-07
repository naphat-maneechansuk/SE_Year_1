package Employee;

public class Tester {
    public static void main(String[] args) {
        Employee employee[] = new Employee[5];
        Sales s1 = new Sales("jame",15000,5000);
        Sales s2 = new Sales("Bell",20000,8000);
        employee[0] = s1;
        employee[1] = s2;
        Manager m1 = new Manager("Peter",40000,"40-19");
        employee[2] = m1;
        String prog[] = {"java","C"};
        Programer p1 = new Programer("Ann",30000,prog,10000);
        String prog1[] = {"java","PHP","Python"};
        Programer p2 = new Programer("Bank",40000,prog1,8000);
        employee[3] = p1;
        employee[4] = p2;
        for (int i = 0;i < employee.length ; i++){
            System.out.println(employee[i].toString());
        }
    }
}
