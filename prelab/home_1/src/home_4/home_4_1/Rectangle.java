package home_4.home_4_1;

public class Rectangle {
    private double width;
    private double length;
    Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }
    public double area(){
        return width * length;
    }
}
