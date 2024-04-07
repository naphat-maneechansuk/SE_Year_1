package Nameable;

public class Animal implements Nameable{
    public String name;
    public String type;
    public Animal(){
        name = null;
        type = null;
    }
    public Animal(String name,String type){
        this.name = name;
        this.type = type;
    }

    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
}
