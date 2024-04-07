package Nameable;

public class Things implements Nameable{
    public String name;
    public String howToUse;
    public Things(){
        name = null;
        howToUse = null;
    }
    public Things(String name, String howToUse){
        this.name = name;
        this.howToUse = howToUse;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
}
