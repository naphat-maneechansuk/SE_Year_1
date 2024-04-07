package employee;

public class Employee {
    private String empName;
    private String empNumber;
    private String hireDate;
    Employee(){
        empName =null;
        empNumber=null;
        hireDate=null;
    }Employee(String empName, String empNumber,String hireDate){
        this.empName =empName;
        this.empNumber=empNumber;
        this.hireDate=hireDate;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }
    public void setHireDate(String hireDate) {
        this.hireDate = hireDate;
    }
    public String getEmpName() {
        return empName;
    }
    public String getEmpNumber() {
        return empNumber;
    }
    public String getHireDate() {
        return hireDate;
    }
    public void showInfo(){
        System.out.println("Name : "+empName);
        System.out.println("Number : "+empNumber);
        System.out.println("Date : "+hireDate);
    }
}
