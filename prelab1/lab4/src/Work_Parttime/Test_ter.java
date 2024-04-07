package Work_Parttime;

public class Test_ter {
    public static void main(String[] args) {
        Employee employee = new Employee();
        ParttimeEmployee parttimeEmployee = new ParttimeEmployee();
        employee.setFirst_name("Michael");
        employee.setLast_name("jackson");
        employee.setSalary(100000);
        parttimeEmployee.setFirst_name("ricado");
        parttimeEmployee.setLast_name("mirost");
        parttimeEmployee.set(24,500);
        System.out.println(employee.name()+" salary : "+employee.getSalary());
        System.out.println(parttimeEmployee.name()+" salary : "+(parttimeEmployee.getHour()*parttimeEmployee.getWage()));
    }
}
