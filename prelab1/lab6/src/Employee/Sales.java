package Employee;

public class Sales extends Employee{
    double commission;
    public Sales(){
        super();
        commission = 0;
    }
    public Sales(String name ,double salary,double commission){
        super(name ,salary);
        this.commission = commission;
    }
    public double calSalary(){
        return salary + this.commission;
    }
    public void setCommission(double commission) {
        this.commission = commission;
    } public String toString() {
        return super.toString()+"\n"+"I am a sales."+ '\n' + "My salary is " + this.calSalary();
    }
}
