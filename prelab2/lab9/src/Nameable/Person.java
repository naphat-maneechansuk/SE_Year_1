package Nameable;

import Nameable.Nameable;

public class Person implements Nameable {
    public String name;
    public String age;
    public Person(){
        this.name = null;
        this.age = null;
    }
    public Person(String name,String age){
        this.name = name;
        this.age = age;
    }
    public void setName(String n){
        this.name = n;
    }
    public String getName(){
        return name;
    }
}
