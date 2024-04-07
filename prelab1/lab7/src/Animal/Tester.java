package Animal;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int num = kb.nextInt();
        Fish f = new Fish();
        Poultry p = new Poultry();
        Animal a[] = new Animal[num];
        for (int i = 0; i < num; i++) {
            String type = kb.next();
            String name = kb.next();
            if (type.equals("Duck")){
                a[i] = new Duck(name);
                Poultry.total++;
            }else if (type.equals("Chicken")){
                 a[i] = new Chicken(name);
                Poultry.total++;
            }else if (type.equals("Parrot")){
                 a[i] = new Parrot(name);
                Poultry.total++;
            }else if (type.equals("Shark")){
                 a[i] = new Shark(name);
                Fish.total++;
            }else if (type.equals("Ray")){
                a[i] = new Ray(name);
                Fish.total++;
            }else if (type.equals("Dolphin")){
                 a[i] = new Dolphin(name);
                Fish.total++;
            }
        }
        for (int i = 0; i < num; i++) {
            System.out.println(a[i].toString());
        }
        System.out.println("The number of Poultry = "+Poultry.getTotal());
        System.out.println("The number of Fish = "+Fish.getTotal());
    }
}
