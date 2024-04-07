package Work_Parttime;

public class Employee extends Person{
    int salary;

    Employee(){
        salary = 0;
    }
    Employee(int salary){
        this.salary = salary;
    }
    public int setSalary(int salary) {
        return this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
