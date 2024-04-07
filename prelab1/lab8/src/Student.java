public class Student {
    private int id;
    private String name;
    private double gpa;
    public Student(int id, String name, double gpa){
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }
    public String getName() {
        return name;
    }
    public String checkStatus(){
            if (gpa >= 2){
                return "Normal";
            }else if (gpa >=1.75){
                return "Probation";
            }else {
                return "Retired";
            }
    }
    public String getType(){
        char type = String.valueOf(id).charAt(2);
        if (type == '1'){
            return "Day";
        }else {
            return "Special";
        }
    }
}
