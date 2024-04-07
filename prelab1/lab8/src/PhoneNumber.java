import java.util.ArrayList;

public class PhoneNumber {
    private String name;
    private String number;
    private ArrayList <PhoneNumber> p = new ArrayList <PhoneNumber> ();
    PhoneNumber(){
        name = null;
        number = null;
    }
    PhoneNumber(String name, String number){
        this.name = name;
        this.number = number;
    }
    public String getName() {
        return name;
    }
    public String getNumber() {
        return number;
    }
    public void add(String name , String number){
        p.add(new PhoneNumber(name,number));
    }
    public String search(String name){
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getName().equals(name)) {
                return p.get(i).toString();
            }
        }return "Not found";
    }
    public void delete(String name){
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getName().equals(name)){
                    p.remove(i);
                    print();
            }
        }
    }

    public void print (){
        System.out.println(p);
    }

    @Override
    public String toString() {
        return "Name='"+name + "', Phone= '" + number+"'";
    }
}
