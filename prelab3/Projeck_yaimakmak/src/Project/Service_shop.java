package Project;

import java.util.AbstractList;
import java.util.ArrayList;

public class Service_shop extends Service {
    private String name ;
    private String password;
    private AbstractList<Service> s = new ArrayList<Service>();
    public Service_shop(){
        this.name = null;
        this.password = null;
    }
    public Service_shop(String name, String passWord){
        this.name = name;
        this.password = passWord;
    }
    public String getName() {
        return name;
    }
    public String getPassWord() {
        return password;
    }
    public void addService(String name, double commission){
        s.add(new Service(name,commission));
    }
    //เพิ่มบริการ
    public void deleteService(String name){
        //ลบบริการ
        boolean check = false;
        for (int i = 0; i < s.size(); i++) {
            //ถ้าไม่เจอชื่อบริการที่จะลบ
            if (s.get(i).getName().equals(name)){
                System.out.println("Deleted "+s.get(i).getName()+" already");
                s.remove(i);
                check = true;
                break;
            }
        }
        if (check == false){
            System.out.println("This Service list was not found.");
        }
    }
    public void calculateService(double input){
        //หาบริการที่ตรงกับความต้องการของลูกค้า
        for (int i = 0 ; i < s.size(); i++){
            if (s.get(i).getPrice() <= input) {
                if (i == 0) {
                    System.out.println(getName() + " <Service>");
                    System.out.println("Service"+(i+1)+". name "+ s.get(i).getName() + " " + s.get(i).getPrice() + "$");
                }else {
                    System.out.println("Service"+(i+1)+". name "+ s.get(i).getName() + " " + s.get(i).getPrice() + "$");
                }
            }
        }
    }
    public boolean searchService(String name) {
        //เช็คว่าร้านค้านี้มีบริการหรือไม่
        int check = 0;
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).getName().equals(name)) {
                check++;
            }
        }
        if (check > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void editService(String name ,String name2 , double commission){
        //เเก้ไขบริการ
        boolean check = searchService(name);
        if (check == true) {
            for (int i = 0; i < s.size(); i++) {
                if (s.get(i).getName().equals(name)) {
                    s.set(i, new Service(name2, commission));
                }
            }
        }
    }
    public void showService(){
        //เเสดงรายชื่อบริการในร้าน
        for (int i = 0;i < s.size();i++ ){
            System.out.println(s.get(i).getName() + " "+ s.get(i).getPrice()+"$");
        }
    }
}
