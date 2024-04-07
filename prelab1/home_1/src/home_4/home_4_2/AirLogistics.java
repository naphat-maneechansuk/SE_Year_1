package home_4.home_4_2;

public class AirLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return  new Plane();
    }
}
