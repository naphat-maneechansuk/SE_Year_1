package Animal;

public class Poultry extends Animal{
    private String my_type = "Poultry";
    Organ wing = new Organ("wing");
    static int total = 0;
    public Poultry(){
        super();
        this.my_type = "Poultry";
    }
    public Poultry(String name){
        super.name = name;
        super.o = wing;
        this.my_type = my_type;
    }
    public static int getTotal() {
        return total;
    }
    @Override
    public String toString() {
        return super.toString()+"I am a Poultry. I have wing. " ;
    }
}
