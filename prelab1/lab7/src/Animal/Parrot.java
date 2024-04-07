package Animal;

public class Parrot extends Poultry{
    public Parrot(){
        super();
    }
    public Parrot(String name){
        super(name);
    }
    public String toString() {
        return this.eat();
    }
    public String move(){
        return super.toString()+" I like  speaking. ";
    }
    public String eat(){
        return this.move()+ " I eat bean ";
    }
}
