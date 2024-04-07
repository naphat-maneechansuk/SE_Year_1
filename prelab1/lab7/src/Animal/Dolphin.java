package Animal;

public class Dolphin extends Fish{
    public Dolphin(){
        super();
    }
    public Dolphin(String name){
        super(name);
    }
    public String toString() {
        return this.eat();
    }
    public String move(){
        return super.toString()+" I like hover swimming. ";
    }
    public String eat(){
        return this.move()+ " I eat seaweed ";
    }
}
