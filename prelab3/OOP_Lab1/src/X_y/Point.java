package X_y;

public class Point {
    int x;
    int y;
    Point (){
        x=0;
        y=0;
    }
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    void setX(int x){
        this.x = x;
    }
    void setY(int y){
        this.y = y;
    }
    void setLocation(int x ,int y){
        this.x=x;
        this.y=y;
    }
     int getX() {
        return x;
    }

     int getY() {
        return y;
    }
    public String toString(){
        return "Point "+"("+"x="+x+",y="+y+")";

    }
}
