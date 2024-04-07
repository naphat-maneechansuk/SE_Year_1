package Employee;

public class Employee extends Person{
    protected int salary;
    protected String position;
    public Employee(){
        super();
        salary = 0;
        position = null;
    }
    public Employee(String firstname ,String lastname,int salary,String position){
        super(firstname,lastname);
        this.salary = salary;
        this.position = position;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public int getSalary() {
        return salary;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getPosition() {
        return position;
    }
    public int calculatePay(){
        return salary;
    }
    public void upSalary(int percent){
        this.salary = salary + (salary/100)*percent;
    }
    @Override
    public String toString() {
        return "Employee : "+firstname + " " + lastname+" "+position+ " " +calculatePay();
    }
}
