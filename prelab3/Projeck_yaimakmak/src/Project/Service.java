package Project;

public class Service implements Price{
    private String name ;
    private double commission;
    Service(){

    }
    Service(String name, double commission){
        this.name = name;
        this.commission = commission;
    }
    public String getName() {
        return name;
    }

    public double getPrice(){
        return commission;
    }

}
