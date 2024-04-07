package Pack1;

public class Person {
        private String username;
        private String password;
        private String name;
        private String email;
        public Person(){
            username = "";
            password = "";
            name = "";
            email = "";
        }
        public Person(String username, String password, String name, String email){
            this.username = username;
            this.password = password;
            this.name = name;
            this.email = email;
        }
        public String getUserName(){
            return username;
        }
        public String getPassword(){
            return password;
        }
        public String getName(){
            return name;
        }
        public String getEmail(){
            return email;
        }
        public String toString(){
            return "Name : " + getName() + "\nEmail : " + getEmail();
        }
}
