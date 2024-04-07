package home_4.home_4_2;

public class Plane implements Transport{
    private double rate = 10;
    public void deliver(){
        System.out.println("Deliver By Plane");
    }
    @Override
    public double getRate() {
        return rate;
    }
}
