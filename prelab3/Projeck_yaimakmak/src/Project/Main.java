package Project;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        AbstractList<Store> s = new ArrayList<Store>();
        AbstractList<Service_shop> sS = new ArrayList<Service_shop>();
        AbstractList<Landmark> l = new ArrayList<Landmark>();
        for (;;) {
            System.out.println("<=====================>");
            System.out.println("Welcome to my program\nPlease press \n1.(Guest) 2.(Merchant) E.(Exit)");
            char type = kb.next().charAt(0);
            //รับค่าสถานะเพื่อระบุว่าต้องการใช้บริการเเบบใด
            if (type == '1') {
                //เป็นผู้ใช้บริการ
                System.out.println("<=====================>");
                if (s.size() ==0 && sS.size()==0 && l.size() == 0){
                    //กรณีที่ไม่มีร้านค้าให้บริการ
                    System.out.println("There are no shops participating in the project.");
                    break;
                }
                for (;;){
                System.out.println("you are Guest\nPlease enter the amount of money you want. To exit, press "+"-1");
                try {
                    //ดักคนกวนประสาท
                    double inputPrice = kb.nextDouble();
                    if (inputPrice < 0) {
                        //กรณีที่ใส่ -1 เพื่อหยุด
                        break;
                    }
                    for (int i = 0; i < s.size(); i++) {
                        //วนหาใน store
                        s.get(i).calculateProduct(inputPrice);
                    }
                    for (int i = 0; i < sS.size(); i++) {
                        //วนหาใน ser shop
                        sS.get(i).calculateService(inputPrice);
                    }
                    for (int i = 0 ; i < l.size();i++){
                        //วนหาใน landmark
                        if (l.get(i).getPrice() <= inputPrice){
                            System.out.println(l.get(i).getName() + "<Landmark>" + l.get(i).getPrice()+"$");
                        }
                    }
                }catch (Exception e){
                    System.out.println("Incorrect information entered");
                }
                }
            } else if (type == '2') {
                //ผู้ให้บริการ
                for (;;){
                System.out.println("<=====================>");
                System.out.println("Your service location is ");
                System.out.println("1.Store\n2.Service shop\n3.Landmark\n4.Exit");
                char type0 = kb.next().charAt(0);
                //บอกว่าสถานที่บริการเป็นประเภทอะไร
                     if (type0 == '4'){
                         //exit
                   break;
                }
                else if (type0 == '1') {
                    //เป็นผู้ให้บริการร้านขายของ
                    for (;;) {
                        //ถามว่าต้องการทำอะไรเกี่ยวกับร้าน
                        System.out.println("=====Store=====");
                        System.out.println("Do you want to\n1.Edit store \n2.Create a new store\n3.Exit");
                        char type1 = kb.next().charAt(0);
                        //ระบุว่าต้องการทำอะไรกับสถานที่ให้บริการ
                        if (type1 == '3'){
                            //exit
                            break;
                        }else if (type1 == '1') {
                            //Edit store
                            System.out.println("What is you Name of store?");
                            //กรอกชื่อเเละรหัสให้ถูก
                            String name = kb.next();
                            System.out.println("Enter the correct password.");
                            String password = kb.next();
                            boolean check1 = false ;
                            //เช็คว่ามีร้านนี้จริงไหม
                            int editProduct = -1;
                            for (int i = 0 ; i < s.size() ; i++){
                                if (s.get(i).getName().equals(name) && s.get(i).getPassWord().equals(password)){
                                    check1 = true;
                                    editProduct = i;
                                }
                            }
                            if (check1 == true){
                                //Edit สำเร็จ
                                for (; ; ) {
                                    System.out.println("Do you want to");
                                    System.out.println("1.Edit Store" + "\n"  + "2.Edit Product" + "\n" + "3.exit");
                                    //ถามว่าจะเเก้ไขอะไร
                                    type1 = kb.next().charAt(0);
                                    //ระบุว่าเเก้ไขสิ่งใด
                                    if (type1 == '3') {
                                        break;
                                    }else if (type1 == '1') {
                                        //เเก้ไขร้านค้า
                                        System.out.println("Enter the name you want to edit.");
                                        String name1 = kb.next();
                                        System.out.println("Enter the password you want to edit.");
                                        String password1 = kb.next();
                                        s.set(editProduct,new Store(name1,password1));
                                    } else if (type1 == '2') {
                                        //เเก้ไขสินค้า
                                        for (; ; ) {
                                            System.out.println("<list product>");
                                            s.get(editProduct).show();
                                            System.out.println("You want to" + "\n" + "1.add product" + "\n" + "2.delete product" + "\n" + "3.edit product" + "\n" + "4.exit");
                                            type1 = kb.next().charAt(0);
                                            //ระบุว่าต้องการเพิ่มลดหรือเเก้ไขสินค้าอย่างไร
                                            if (type1 == '1') {
                                                //add
                                                System.out.print("Name of product : ");
                                                String name1 = kb.next();
                                                System.out.print("Price : ");
                                                double price = kb.nextDouble();
                                                s.get(editProduct).addProduct(name1,price);
                                            } else if (type1 == '2') {
                                                //delete
                                                System.out.print("Name of product : ");
                                                String name1 = kb.next();
                                                s.get(editProduct).deleteProduct(name1);
                                            } else if (type1 == '3') {
                                                //edit
                                                System.out.println("Which product do you want to edit?");
                                                String name1 = kb.next();
                                                //กรอกชื่อสิ้นค้าที่ต้องการเเก้ไขใหม่
                                                if (s.get(editProduct).searchProduct(name1)== false){
                                                    //เช็คว่ามีสินค้านี้อยู่จริงไหม
                                                    System.out.println("Product list not found");
                                                    continue;
                                                }
                                                System.out.println("Fill in the name of the edited product.");
                                                String name2 = kb.next();
                                                System.out.println("Fill in the price of the edited product.");
                                                double price = kb.nextDouble();
                                                s.get(editProduct).editProduct(name1,name2,price);
                                            } else if (type1 == '4') {
                                                //Exit
                                                break;
                                            } else {
                                                //ตอบไม่ตรงกับที่กำหนด
                                                System.out.println("You entered incorrect information. Please try again.");
                                            }
                                        }
                                    }  else {
                                        //ตอบไม่ตรงกับที่กำหนด
                                        System.out.println("You entered incorrect information. Please try again.");
                                    }
                                }
                            } else {
                                System.out.println("Invalid name or password");
                                //ใส่ชื่อหรือรหัสไม่ถูก
                            }
                        } else if (type1 == '2') {
                            //Create a new store
                            System.out.println("Fill in the name and password you want to create.");
                            //สร้างร้านใหม่ กรอกชื่อเเละรหัส
                            System.out.println("What is you Name of store");
                            String name = kb.next();
                            System.out.println("Enter the correct password.");
                            String password = kb.next();
                            s.add(new Store(name,password));
                            for (;;){
                                System.out.println("Do you want to add new products?");
                                System.out.println("y.yes or n.no");
                                type1 = kb.next().charAt(0);
                                int editProduct = -1;
                                for (int i = 0 ; i < s.size() ; i++){
                                    //กำหนดไว้เพื่อระบุต่ำเเหน่งร้านค้าใหม่เพื่อเพิ่มสินค้าเข้าทันที
                                    if (s.get(i).getName().equals(name) && s.get(i).getPassWord().equals(password)){
                                        editProduct = i;
                                    }
                                }
                                if (type1 == 'y'){
                                    System.out.println("Enter name ");
                                    String name1 = kb.next();
                                    System.out.println("Enter price");
                                    double price = kb.nextDouble();
                                    s.get(editProduct).addProduct(name1,price);
                                }else if (type1 == 'n'){
                                    break;
                                }else {
                                    System.out.println("You entered incorrect information. Please try again.");
                                }
                            }
                        } else {
                            System.out.println("You entered incorrect information. Please try again.");
                        }
                    }
                }else if (type0 == '2'){
                    //ร้านให้บริการ
                    for (;;){//คำสั่งส่วนใหญ่จะคล้ายกับ store
                        System.out.println("=====Service shop=====");
                        System.out.println("Do you want to\n1.Edit Service shop\n2.Create a new shop\n3.Exit");
                        char type2 = kb.next().charAt(0);
                        if (type2 == '1') {
                            //Edit shop
                                System.out.println("What is you Name of service shop?");
                                String name = kb.next();
                                System.out.println("Enter the correct password.");
                                String password = kb.next();
                            boolean check2 = false ;
                            int editService = -1;
                            //วนหาตำเเหน่งจากชื่อที่กำหนด
                            for (int i = 0 ; i < s.size() ; i++){
                                if (sS.get(i).getName().equals(name) && sS.get(i).getPassWord().equals(password)){
                                    check2 = true;
                                    editService = i;
                                }
                            }
                            if (check2 == true){
                                //Editshop สำเร็จ
                                for (; ; ) {
                                    System.out.println("Do you want to");
                                    System.out.println("1.Edit Shop" + "\n" + "2.Edit Service" + "\n" + "3.exit");
                                    //ถามว่าจะเเก้ไขอะไร
                                    type2 = kb.next().charAt(0);
                                    //ระบุว่าเเก้ไขสิ่งใด
                                    if (type2 == '1') {
                                        //Edit shop
                                        System.out.println("Enter the name you want to edit.");
                                        String name1 = kb.next();
                                        System.out.println("Enter the password you want to edit.");
                                        String password1 = kb.next();
                                        sS.set(editService,new Service_shop(name1,password1));
                                    } else if (type2 == '2') {
                                        // Edit Service
                                        for (; ; ) {
                                            System.out.println("<list service>");
                                            sS.get(editService).showService();
                                            System.out.println("You want to" + "\n" + "1.add service" + "\n" + "2.delete service" + "\n" + "3.edit service" + "\n" + "4.exit");
                                            type2 = kb.next().charAt(0);
                                            //ระบุว่าต้องการเพิ่มลดหรือเเก้ไขสินค้าอย่างไร
                                            if (type2 == '1') {//add
                                                System.out.print("Name of product : ");
                                                String name1 = kb.next();
                                                if (sS.get(editService).searchService(name1)== true){//เช็คว่าสินค้าซ้ำไหม
                                                    System.out.println("Product list not found");
                                                    continue;
                                                }
                                                System.out.print("commission : ");
                                                double com = kb.nextDouble();
                                                sS.get(editService).addService(name1,com);
                                            } else if (type2 == '2') {
                                                //delete
                                                System.out.print("Name of service : ");
                                                String name1 = kb.next();
                                                sS.get(editService).deleteService(name1);
                                            } else if (type2 == '3') {
                                                //edit
                                                System.out.println("Which product do you want to edit?");
                                                String name1 = kb.next();
                                                //กรอกชื่อสิ้นค้าที่ต้องการเเก้ไขใหม่
                                                System.out.println("Fill in the name Commission of the edited service.");
                                                String name2 = kb.next();
                                                System.out.println("Fill in the price Commission of the edited service.");
                                                double com = kb.nextDouble();
                                                sS.get(editService).editService(name1,name2,com);
                                            } else if (type2 == '4') {
                                                break;
                                            } else {
                                                System.out.println("You entered incorrect information. Please try again.");
                                            }
                                        }
                                    } else if (type2 == '3') {
                                        break;
                                    } else {
                                        System.out.println("You entered incorrect information. Please try again.");
                                    }
                                }
                            } else {
                                System.out.println("Invalid name or password");
                                //ใส่ชื่อหรือรหัสไม่ถูก
                            }

                        }else if (type2 =='2'){
                            //สร้าง shopใหม่
                            System.out.println("Fill in the name and password you want to create.");
                            //สร้างร้านใหม่ กรอกชื่อเเละรหัส
                            System.out.println("What is you Name of service shop");
                            String name = kb.next();
                            System.out.println("Enter the correct password.");
                            String password = kb.next();
                            sS.add(new Service_shop(name,password));
                            int editService = -1;
                            for (int i = 0 ; i < s.size() ; i++){
                                //หาตำเเหน่งร้านที่พึ่งสร้าง
                                if (sS.get(i).getName().equals(name) && sS.get(i).getPassWord().equals(password)){
                                    editService = i;
                                }
                            }
                            for (;;){
                                //ใส่รายการบริการเข้าไปเรื่อย
                                System.out.println("Do you want to add new service?");
                                System.out.println("y.yes or n.no");
                                type2 = kb.next().charAt(0);
                                if (type2 == 'y'){
                                    System.out.println("Enter name ");
                                    String name1 = kb.next();
                                    System.out.println("Enter price");
                                    double com = kb.nextDouble();
                                    sS.get(editService).addService(name1,com);
                                }else if (type2 == 'n'){
                                    break;
                                }else {
                                    System.out.println("You entered incorrect information. Please try again.");
                                }
                            }
                        }else if (type2 == '3'){
                            break;
                        }else {
                            System.out.println("You entered incorrect information. Please try again.");
                        }
                    }
                }else if (type0 == '3'){
                    //เเลนมาร์ค
                    for (;;) {
                        System.out.println("=====Landmark=====");
                        System.out.println("Do you want to\n1.Edit landmark\n2.Create a new landmark\n3.Exit");
                        char type3 = kb.next().charAt(0);
                        if (type3 == '1'){
                            System.out.println("What is you Name of landmark?");
                            String name = kb.next();
                            System.out.println("Enter the correct password.");
                            String password = kb.next();
                            boolean check3 = false ;
                            int editLandmark = -1;
                            for (int i = 0 ; i < s.size() ; i++){
                                //หาตำเเหน่งที่ต้องการเเก้ไข
                                if (l.get(i).getName().equals(name) && l.get(i).getPassword().equals(password)){
                                    check3 = true;
                                    editLandmark = i;
                                }
                            }
                            if (check3 == true){
                                //หาเจอ
                                for (; ; ) {
                                    System.out.println("Do you want to");
                                    System.out.println("1.Edit Name,Password and Admission\n2.exit");
                                    char type4 = kb.next().charAt(0);
                                    if (type4 == '1') {
                                        System.out.println("Enter the name you want to edit.");
                                        String name1 = kb.next();
                                        System.out.println("Enter the password you want to edit.");
                                        String password1 = kb.next();
                                        System.out.println("Enter the admission you want to edit.");
                                        double admis = kb.nextDouble();
                                        l.set(editLandmark,new Landmark(name1,password1,admis));
                                    }
                                    else if (type4 == '2'){
                                        break;
                                    }else {
                                        System.out.println("You entered incorrect information. Please try again.");
                                    }
                                }
                            }else {
                                System.out.println("Invalid name or password");
                                //ใส่ชื่อหรือรหัสผิด
                            }
                        }else if (type3 == '2'){
                            System.out.println("Fill in the name you want to create.");
                            String nameL = kb.next();
                            System.out.println("Fill in the password you want to create.");
                            String passwordL = kb.next();
                            System.out.println("Fill in the admission you want to create.");
                            double addmis = kb.nextDouble();
                            l.add(new Landmark(nameL,passwordL,addmis));
                        }else if (type3 == '3'){
                            break;
                        }else {
                            System.out.println("You entered incorrect information. Please try again.");
                        }
                    }
                } else {
                    System.out.println("You entered incorrect information.");
                }
            }
            }else if (type =='E'){
                System.out.println("Thank you for using the service.");
                break;
            } else {
                System.out.println("You entered incorrect information. Please try again.");
            }
        }
    }
}
