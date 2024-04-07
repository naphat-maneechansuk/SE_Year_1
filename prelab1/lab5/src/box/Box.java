package box;

public class Box extends Rectangle{
    public double depth;
    public Box(){
        depth = 0;
    }
    public Box(double length ,double width,double depth) {
        super.length= length;
        super.width = width;
        this.depth = depth;
    }
    @Override
    public void setDimension(double width,double length,double depth) {
        super.length= length;
        super.width = width;
        this.depth = depth;
    }
    public double getDepth() {
        return depth;
    }
    public double volumn(){
        return width*length*depth;
    }
    public double surface(){
        return (2*width*length)+(2*length*depth)+(2*width*depth);
    }
    public String toString(){
        return "Box: width = "+width+" length = "+length+" depth = "+depth;
    }
}
