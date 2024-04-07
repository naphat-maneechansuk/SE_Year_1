package home_4.home_4_2;

public abstract class Logistics {
    private Transport trans;
    private double distance = 0;
    public abstract Transport createTransport();
    public double planDelivery(int distance){
        Transport t = createTransport();
        double total = distance * createTransport().getRate();
        return total;
    }
    public void deliver(){
        createTransport().deliver();
    }
}
