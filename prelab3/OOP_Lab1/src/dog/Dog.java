package dog;

public class Dog {
    String name;
    String breed;
    Dog(){
        name = "unknow";
        breed = "unknow";
    }
    Dog(String n ,String b){
        name = n;
        breed = b;
    }
    void setName(String n){ name = n;}
    String getName(){ return name;}
    void setBreed(String b){ breed = b;}
    String getBreed(){ return breed;}
    void makeSound(){System.out.println("Boc Boc Boc");}

}
