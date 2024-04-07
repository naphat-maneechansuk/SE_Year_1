package home_4.home_4_1;

public class Triangle {
    private double base;
    private double height;
    public Triangle(double base ,double height){
        this.base = base;
        this.height = height;
    }
    public double area(){
        return (base * height)/2;
    }
}
