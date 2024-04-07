package mixed_number;

public class MixedNumber {
    private int numberals;
    private Fraction fraction;
    public MixedNumber(){
        numberals = 0;
        fraction = new Fraction(0,1);
    }
    public MixedNumber(int numberals , Fraction f){
        this.numberals = numberals;
        this.fraction = f;
    }
    public void setValue(int n , Fraction f){
        this.numberals = n;
        this.fraction = f;
    }
    public void print() {
        int n = fraction.getNumerator();
        int d = fraction.getDenominator();
        if (fraction.getNumerator() == 0) {
            d = 0;
        }else if (d<0){
            n *= -1;
            d *= -1;
        }
        System.out.println(numberals + " " + n + "/" + d);
    }
    public MixedNumber makeNewFormat(){
        Fraction f =new Fraction(fraction.makeNewFormat().getNumerator(),fraction.makeNewFormat().getDenominator());
        if (f.getNumerator()==0 ||f.getDenominator()==0){
            int num = f.getNumerator()/f.getDenominator();
            f.setValue(num,f.getDenominator());
        }
        return new MixedNumber(numberals+(fraction.getNumerator()/fraction.getDenominator()),f);
    }

    public Fraction convertToFraction(){
        int numbertor = (fraction.getDenominator() * numberals)+fraction.getNumerator();
        int denominator = (fraction.getDenominator());
        Fraction f = new Fraction(numbertor,denominator);
        return f.makeNewFormat();
    }
    public MixedNumber add(MixedNumber m){
        Fraction f = this.convertToFraction().add(m.convertToFraction());
        int numberals = f.getNumerator()/f.getDenominator();
        int numerator = f.getNumerator()%f.getDenominator();
        Fraction f1 = new Fraction(numerator , f.getDenominator());
        MixedNumber mixedNumber = new MixedNumber(numberals,f1);
        return mixedNumber;
        /*
         Fraction a1 = this.convertToFraction();
         Fraction a2 = m.convertToFraction();
         Fraction ff = a1.add(a2);
         int totol = ff.getNumerator();
         int totoll = totol / ff.getDenominator();
         int totolll = totol % ff.getDenominator();
         Fraction F = new Fraction(totolll, ff.getDenominator());
         MixedNumber m1 = new MixedNumber(totoll,F);
         return m1;
         */
    }

    public MixedNumber add(Fraction f){
        Fraction a1 = this.convertToFraction();
        Fraction ff = a1.add(f);
        int totol = ff.getNumerator();
        int totoll = totol / ff.getDenominator();
        int totolll = totol % ff.getDenominator();
        Fraction F = new Fraction(totolll, ff.getDenominator());
        MixedNumber m1 = new MixedNumber(totoll,F);
        return m1;
    }
    public MixedNumber minus(MixedNumber m){
        Fraction f = this.convertToFraction().minus(m.convertToFraction());
        int numberals = f.getNumerator()/f.getDenominator();
        int numerator = f.getNumerator()%f.getDenominator();
        Fraction f1 = new Fraction(numerator , f.getDenominator());
        MixedNumber mixedNumber = new MixedNumber(numberals,f1);
        return mixedNumber;
    }

    public MixedNumber mul(MixedNumber m){
        Fraction f = this.convertToFraction().multiply(m.convertToFraction());
        int numberals = f.getNumerator()/f.getDenominator();
        int numerator = f.getNumerator()%f.getDenominator();
        Fraction f1 = new Fraction(numerator , f.getDenominator());
        MixedNumber mixedNumber = new MixedNumber(numberals,f1);
        return mixedNumber;
    }

    public MixedNumber divide(MixedNumber m) {
        Fraction f = this.convertToFraction().divide(m.convertToFraction());
        int numberals = f.getNumerator()/f.getDenominator();
        int numerator = f.getNumerator()%f.getDenominator();
        Fraction f1 = new Fraction(numerator , f.getDenominator());
        MixedNumber mixedNumber = new MixedNumber(numberals,f1);
        return mixedNumber;
    }



}
