package Employee;

public class SaleMan extends Employee{
    protected int saleAmount;
    public SaleMan(){
        super();
        saleAmount = 0 ;
    }
    public SaleMan(String firstname ,String lastname,int salary,String position,int amount){
        super(firstname,lastname,salary,position);
            this.saleAmount = amount;
    }
    @Override
    public int calculatePay() {
        return salary + (saleAmount/100)*5;
    }
    
}
