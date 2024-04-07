package Animal;

public class Shark extends Fish{
    public Shark(){
        super();
    }
    public Shark(String name){
        super(name);
    }
    public String toString() {
        return this.eat();
    }
    public String move(){
        return super.toString()+" I like straight swimming. ";
    }
    public String eat(){
        return this.move()+ " I eat smallfish ";
    }
}
