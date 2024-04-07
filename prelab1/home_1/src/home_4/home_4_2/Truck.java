package home_4.home_4_2;

public class Truck implements Transport{
    private double rate = 5;
    public void  deliver(){
        System.out.println("Deliver By Truck");
    }
    public double getRate(){
        return this.rate;
    }
}
