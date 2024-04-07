package home_4.home_4_2;

public class Ship implements Transport{
    private double rate = 2;
    public void deliver(){
        System.out.println("Deliver By Ship");
    }
    public double getRate(){
        return this.rate;
    }

}
