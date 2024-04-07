package Animal;

public class Duck extends Poultry{
    public Duck(){
        super();
    }
    public Duck(String name ){
        super(name);
    }

    @Override
    public String toString() {
            return this.eat();
    }
    public String move(){
        return super.toString()+" I like  swimming. ";
    }
    public String eat(){
        return this.move()+ " I eat rice ";
    }
}
