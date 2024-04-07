package police_station;

public class Police extends Person{
    String workCountry;
    public Police(){
        super();
        workCountry = null;
    }
    public Police(String name,int bornYear,String workCountry){
        super(name,bornYear);
        this.workCountry = workCountry;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I’ m a police and work in "+ workCountry);
    }
}
