package police_station;

public class Sheriff extends Person{
    String workState;
    public Sheriff(){
        super();
        workState = null;
    }
    public Sheriff(String name,int bornYear,String workState){
        super(name,bornYear);
        this.workState = workState;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a sheriff and work in "+workState);
    }
}
