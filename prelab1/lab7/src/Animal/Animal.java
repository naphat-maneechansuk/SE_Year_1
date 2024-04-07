package Animal;

public class Animal {
    protected String name;
    protected Organ o;
    public Animal(){
        this.name = null;
        this.o = null;
    }
    public Animal(Organ o,String name){
        this.name = name;
        this.o = o;
    }
    @Override
    public String toString() {
        return "Hello, my name is " + name+"." ;
    }
}
