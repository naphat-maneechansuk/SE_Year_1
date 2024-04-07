package Employee;

public class Manager extends Employee{
    String parkingNo;
    public Manager(){
        super();
        parkingNo = null;
    }
    public Manager(String name,double salary,String parkingNo){
        super(name,salary);
        this.parkingNo = parkingNo;
    }
    public double calSalary(){
        return salary;
    }
    public String toString() {
        return  super.toString()+"\n"+"I am a manager."+ '\n' + "My salary is " + calSalary();

    }
}
