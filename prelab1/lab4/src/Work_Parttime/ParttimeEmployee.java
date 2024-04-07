package Work_Parttime;

public class ParttimeEmployee extends Person{
    int hour;
    int wage;
    ParttimeEmployee(){hour = 0;wage = 0;}
    ParttimeEmployee(int hour,int wage){this.hour = hour;this.wage =wage;}
    public void set(int hour,int wage){
        this.hour = hour;
        this.wage =wage;
    }
    public void setHour(int hour) {this.hour = hour;}
    public void setWage(int wage) {this.wage = wage;}
    public int getHour() {
        return hour;
    }
    public int getWage() {return wage;}
}
