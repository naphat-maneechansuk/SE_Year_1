package Animal;

public class Organ {
    private String type;
    public Organ(){
        this.type = null;
    }
    public Organ(String type){
        this.type = type;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
}
