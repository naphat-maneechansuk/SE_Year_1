package Animal;

public class Chicken extends Poultry{
    public Chicken(){
        super();
    }
    public Chicken(String name){
        super(name);
    }
    public String toString() {
        return this.eat();
    }
    public String move(){
        return super.toString()+" I like  walking. ";
    }
    public String eat(){
        return this.move()+ " I eat worm ";
    }
}
