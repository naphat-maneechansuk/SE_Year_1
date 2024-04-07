package Animal;

public class Ray extends Fish{
    public Ray(){
        super();
    }
    public Ray(String name){
        super(name);
    }
    public String toString() {
        return this.eat();
    }
    public String move(){
        return super.toString()+" I like straight circulate swimming. ";
    }
    public String eat(){
        return this.move()+ " I eat plankton ";
    }
}
