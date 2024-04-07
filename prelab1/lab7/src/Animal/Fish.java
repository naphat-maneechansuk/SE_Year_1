package Animal;

public class Fish extends Animal{
    private String my_type ="Fish";
    static int total = 0;
    Organ fin = new Organ("fin");
    public Fish(){
        super();
        this.my_type = "Fish";
    }
    public Fish(String name){
        super.name = name;
        super.o = fin;
        this.my_type = my_type;
    }
    public static int getTotal() {
        return total;
    }
    @Override
    public String toString() {
        return super.toString()+"I am a fish";
    }
}
