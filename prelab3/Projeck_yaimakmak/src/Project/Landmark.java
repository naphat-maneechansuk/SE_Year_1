package Project;

public class Landmark implements Price{
    private double admission;
    private String name ;
    private String password;
    Landmark(){

    }
    public Landmark(String name , String password , double admission){
        this.name = name;
        this.password = password;
        this.admission = admission;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setAdmission(double admission) {
        this.admission = admission;
    }
    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public double getPrice(){
        return admission;
    }

}
