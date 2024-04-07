package Work_Parttime;

public class Person {
    private String first_name;
    private String last_name;
    Person(){
        this.first_name = null;
        this.last_name = null;
    }
    Person(String f,String l){
        this.first_name =f;
        this.last_name = l;
    }
    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }
    public String getFirst_name() {
        return first_name;
    }
    public String getLast_name() {
        return last_name;
    }
    public String name(){
        return this.first_name+ " "+this.last_name;
    }
}
