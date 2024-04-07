package retailtem;

public class DvdMovie implements RetailItem {
    private String title;
    private String runningTime;
    private double retailPrice;
    public DvdMovie(String title,String runningTime,double retailPrice){
        this.title = title;
        this.runningTime = runningTime;
        this.retailPrice = retailPrice;
    }
    public String getTitle() {
        return title;
    }
    public String getRunningTime() {
        return runningTime;
    }
    public double getRetailPrice() {
        return retailPrice;
    }
}
