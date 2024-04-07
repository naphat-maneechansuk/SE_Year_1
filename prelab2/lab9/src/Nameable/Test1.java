package Nameable;

import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String name = kb.next();
        String age = kb.nextLine();
        Person p = new Person(name,age);
        System.out.println(p.getName());
        name = kb.next();
        String howto = kb.nextLine();
        Things t = new Things(name,howto);
        System.out.println(t.getName());
        name = kb.next();
        String type = kb.nextLine();
        Animal a = new Animal(name,type);
        System.out.println(a.getName());
    }
}
