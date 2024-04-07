package Project;

import java.util.ArrayList;

public class Store extends Product {
    private String name;
    private String passWord;
    private ArrayList<Product> p = new ArrayList<Product>();
    public Store(){
        this.name = null;
        this.passWord = null;
    }
    public Store(String name, String passWord){
        this.name = name;
        this.passWord = passWord;
    }
    public String getName() {
        return name;
    }
    public String getPassWord() {
        return passWord;
    }

    public void addProduct(String name, double price){
        p.add(new Product(name,price));
    }
    //เพิ่มสินค้า
    public void deleteProduct(String name){
        //ลบสินค้า
        boolean check = false;
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getName().equals(name)){
                System.out.println("Deleted "+p.get(i).getName()+" already");
                p.remove(i);
                check = true;
                break;
            }
        }
        if (check == false){
            //ถ้าไม่เจอชื่อสินค้าที่จะลบ
            System.out.println("This product list was not found.");
        }
    }

     public void calculateProduct(double input){
        //หาสินค้าที่ตรงกับความต้องการของลูกค้า
        for (int i = 0 ; i < p.size(); i++){
            if (p.get(i).getPrice() <= input){
                if (i == 0){
                    System.out.println(getName() + " <Store>");
                    System.out.println("Product"+(i+1)+". name "+p.get(i).getName() + " " + p.get(i).getPrice()+"$");
                }else {
                System.out.println("Product"+(i+1)+". name "+p.get(i).getName() + " " + p.get(i).getPrice()+"$");
            }
            }
        }
    }
    public boolean searchProduct(String name) {
        //เช็คว่าร้านค้านี้มีสินค้าหรือไม่
        int check = 0;
        for (int i = 0; i < p.size(); i++) {
            if (p.get(i).getName().equals(name)) {
                check++;
            }
        }
        if (check > 0) {
            return true;
        } else {
            return false;
        }
    }
    public void editProduct(String name ,String name2 , double price){
        //เเก้ไขสินค้า
        boolean check = searchProduct(name);
        if (check == true) {
            for (int i = 0; i < p.size(); i++) {
                if (p.get(i).getName().equals(name)) {
                    p.set(i, new Product(name2, price));
                }
            }
        }
    }
    public void show(){
        //เเสดงรายชื่อสินค้าในร้าน
        for (int i = 0;i < p.size();i++ ){
            System.out.println(p.get(i).getName() + " "+ p.get(i).getPrice()+"$");
        }
    }
}
