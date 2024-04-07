package pet_package;

public class Pet {
    private String name;
    private int weight;
    public Pet(){
        name = null;
        weight=0;
    }public Pet(String name,int weight){
        this.name=name;
        this.weight=weight;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getName() {
        return name;
    }
    public int getWeight() {
        return weight;
    }
    public void eat(){
        System.out.println("yum yum");
        weight++;
    }
    public void print(){
        System.out.println("name : "+name+" "+"weight : "+weight);
    }
}
