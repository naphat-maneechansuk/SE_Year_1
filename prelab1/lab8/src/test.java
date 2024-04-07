import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String stop ;
        PhoneNumber p = new PhoneNumber();
        System.out.println("This program run util you key Q");
        for (;;) {
            System.out.print("Insert what do you want: ");
            stop = kb.next();
            if (stop.equals("Q")){
                break;
            }
            if (stop.equals("add")) {
                String name = kb.next();
                String number = kb.next();
                p.add(name,number);
                p.print();
            }else if (stop.equals("search")){
                String name = kb.next();
                System.out.println(p.search(name));
            }else if (stop.equals("delete")){
                String name = kb.next();
                if(!p.search(name).equals("Not found")){
                    System.out.println("Do you confirm to delete (Y/N): ");
                    String x = kb.next();
                    if (x.equals("Y")) {
                        p.delete(name);
                    }
                }else {
                        System.out.println(name+" not found in our phonebook");
                        p.print();
                    }
            }
        }
    }
}
