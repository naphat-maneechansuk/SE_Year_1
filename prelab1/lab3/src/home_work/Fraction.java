package home_work;

public class Fraction {
    private int numerator;
    private int denominator;
    private int gcd(int n, int d){
        while (d != 0) {
            int gcD = d;
            d = n % d;
            n = gcD;
        }
        return n;
    }
    public Fraction(){
        numerator = 0;
        denominator = 0;
    }
    public Fraction(int n , int d){
        this.numerator = n;
        this.denominator=d;
    }
   void setValue(int n ,int d){
        this.numerator = n;
        this.denominator=d;
   }
    public int getDenominator() {
        return denominator;
    }

    public int getNumerator() {
        return numerator;
    }
    public void print(){
        if (denominator<0){
            numerator *= -1;
            denominator *= -1;
        }
        System.out.println(numerator+"/"+denominator);
    }
    public Fraction makeNewFormat(){
        return new Fraction((numerator/gcd(numerator,denominator)),(denominator/gcd(numerator,denominator)));
    }
    public Fraction add(Fraction f2){
        return new Fraction(((numerator*f2.denominator)+(f2.numerator*denominator)),(denominator* f2.denominator));
    }
    public Fraction minus(Fraction f2){
        return new Fraction(((numerator*f2.denominator)-(f2.numerator*denominator)),(denominator* f2.denominator));
    }
    public Fraction multiply(Fraction f2){
        return new Fraction((numerator* f2.numerator),(denominator* f2.denominator));
    }
    public Fraction divide(Fraction f2){
        return new Fraction((numerator * f2.denominator),(f2.numerator*denominator));
    }
    public boolean isEqual(Fraction f2){
        boolean check = false;
        Fraction x = new Fraction();
        x = this.makeNewFormat();
        f2 = f2.makeNewFormat();
        if ((x.getNumerator()== f2.getNumerator())&&(x.getDenominator()==f2.getDenominator())){
            check =true;
        }
        return check;
    }
}
