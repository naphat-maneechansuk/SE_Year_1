package employee;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Employee p1 =new Employee("Jame","123-A","1-1-2561");
        ProductionWorker pw1 = new ProductionWorker("Day",50);
        pw1.setEmpName(p1.getEmpName());
        pw1.setEmpNumber(p1.getEmpNumber());
        pw1.setHireDate(p1.getHireDate());
        Employee p2 =new Employee("Bell","222-A","2-2-2561");
        ProductionWorker pw2 = new ProductionWorker("Night",100);
        pw2.setEmpName(p2.getEmpName());
        pw2.setEmpNumber(p2.getEmpNumber());
        pw2.setHireDate(p2.getHireDate());
        p1.showInfo();
        pw1.showInfo();
        System.out.print("Enter the number of working hours for "+p1.getEmpName()+" : ");
        int hour1 = kb.nextInt();
        System.out.println("Salary of " +p1.getEmpName()+" = "+pw1.getHourlyPerRate()*hour1);
        System.out.print("Enter the number of working hours for "+p2.getEmpName()+" : ");
        int hour2 = kb.nextInt();
        System.out.println("Salary of " +p2.getEmpName()+" = "+pw2.getHourlyPerRate()*hour2);
        if ((pw1.getHourlyPerRate()*hour1)>(pw2.getHourlyPerRate()*hour2)) {
            System.out.println("Jame has more salary than Bell = " + ((pw1.getHourlyPerRate() * hour1) - (pw2.getHourlyPerRate() * hour2)));
        }else if ((pw2.getHourlyPerRate()*hour2)>(pw1.getHourlyPerRate()*hour1)){
            System.out.println("Jame has more salary than Bell = " + ((pw2.getHourlyPerRate() * hour2)-(pw1.getHourlyPerRate() * hour1)));
        }else {
            System.out.println("Jame ane Bell get the same salary.");
        }
    }
}
