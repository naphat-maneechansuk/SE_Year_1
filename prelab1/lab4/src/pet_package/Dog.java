package pet_package;

public class Dog extends Pet {
    Dog(){
    setName("");
    setWeight(0);
}
    Dog(String name,int weight){
        setName(name);
        setWeight(weight);
    }
   public void makesound(){
       System.out.println("Boc Boc");
   }
}
