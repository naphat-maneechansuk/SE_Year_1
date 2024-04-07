package employee;

public class ProductionWorker extends Employee{
    private String shift ;
    private double hourlyPerRate;
    ProductionWorker(){
        this.shift = "Day";
        this.hourlyPerRate = 50;
    }
    ProductionWorker(String shift,double hourlyPerRate){
        this.shift=shift;
        this.hourlyPerRate=hourlyPerRate;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }
    public void setHourlyPerRate(double hourlyPerRate) {
        this.hourlyPerRate = hourlyPerRate;
    }
    public String getShift() {
        return shift;
    }
    public double getHourlyPerRate() {
        return hourlyPerRate;
    }
    public void showInfo(){
        System.out.println("Shift = "+shift);
        System.out.println("Rate = "+hourlyPerRate);
    }

}
