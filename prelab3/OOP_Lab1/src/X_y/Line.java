package X_y;

public class Line {
    Point start;
    Point end;
    Line(){
        start = new Point();
        end = new Point();
    }
    Line(Point start ,Point end){
        this.start = start;
        this.end = end;
    }
    Line(int xStart ,int yStart ,int xEnd ,int yEnd){
        this.start = new Point(xStart,yStart);
        this.end = new Point(xEnd,yEnd);
    }
    void  setStart(int x ,int y){
        start.setX(x);
        start.setY(y);
    }
    void setEnd(int x, int y){
        end.setX(x);
        end.setY(y);
    }
    Point getStartPoint(){
        return start;
    }
    Point getEndPoint(){
        return end;
    }
    double distance(){
        return Math.sqrt(Math.pow(end.getX() - start.getX(),2)+Math.pow(end.getY()-start.getY(),2));
    }
    public String toString() {
        return "Line [start=Point (x="+start.getX()+",y="+start.getY()+"),end=Point (x="+end.getY()+",y="+end.getY()+")]";
    }
}
