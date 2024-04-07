package Project;

import java.util.ArrayList;

public class Product implements Price{
    private String name;
    private double price;
    public Product(){
        this.name = null;
        this.price = 0;
    }
    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }

}
