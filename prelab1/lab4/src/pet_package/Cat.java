package pet_package;

public class Cat extends Pet{
     Cat() {
        setName("");
        setWeight(0);
    }
    Cat(String name,int weight){
         setName(name);
         setWeight(weight);
    }
    public void makesound(){
        System.out.println("Meaw Meaw");
    }
}
