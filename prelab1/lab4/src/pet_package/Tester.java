package pet_package;

public class Tester {
    public static void main(String[] args) {
        Cat mycat = new Cat();
        Dog mydog =new Dog();
        mycat.setName("mo");
        mycat.setWeight(10);
        mycat.print();
        mydog.setName("bo");
        mydog.setWeight(20);
        mydog.print();
        mydog.makesound();
        mycat.makesound();
        mycat.eat();
        mycat.eat();
        mycat.print();
        mydog.print();
    }

}
