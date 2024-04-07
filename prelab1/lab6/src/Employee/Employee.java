package Employee;

public class Employee {
     String name ;
     double salary;
    Employee(){
        name = null;
        salary = 0;
    }
    Employee(String name, double salary){
        this.name = name;
        this.salary =salary;
    }
    public double calSalary(){
        return this.salary;
    }

    @Override
    public String toString() {
        return "My name is " + name +"."+ '\n' + "My salary is " + salary;
    }
}
