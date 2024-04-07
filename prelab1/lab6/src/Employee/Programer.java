package Employee;

public class Programer extends Employee{
    String progSkill[];
    int OT;
    Programer(){
        super();
        OT = 0;
        progSkill = null;
    }
    Programer( String name,double salary,String progSkill[],int ot){
        super(name,salary);
        this.OT = ot;
        this.progSkill = progSkill;
    }
    public double calSaraly(){
        return salary+OT;
    }
    public String toString() {
        String total = "I am "+name+" am a programer."+ '\n' +"My programmer Skill are : ";
                for (int i=0 ; i<progSkill.length;i++){
                    if (i < progSkill.length-1) {
                        total += progSkill[i] + ", ";
                    }else {
                        total += progSkill[i];
                    }
                }
                total += "\n"+"My salary is " + calSaraly();
                return total;
    }
}
