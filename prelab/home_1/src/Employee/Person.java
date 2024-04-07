package Employee;

public class Person {
    protected String firstname;
    protected String lastname;
    public Person(){
        this.firstname = null;
        this.lastname = null;
    }
    public Person(String firstname, String lastname){
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getLastname() {
        return lastname;
    }

    @Override
    public String toString() {
        return "Person : " + firstname + " " + lastname;
    }
}
