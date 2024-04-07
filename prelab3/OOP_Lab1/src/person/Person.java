package person;

    public class Person{
        String name;
        double weight;
        double height;

        void setName(String n){ name = n; }
        String getName(){ return name; }
        void setWeight(double w){ weight = w;}
        double getWeight() {return weight;}
        void setHeight(double h){ height = h;}
        double getHeight() {return height;}
        double bmi(){
            return  weight/Math.pow(height,2);
        }
    }
