package bankAccount;

public class PiggyBank implements Measurable{
    private int one;
    private int five;
    private int ten;
    private int size;
    public PiggyBank(int size){
        this.size = size;
    }
    public void addOne(int n){
        this.one += n;
    }
    public void addFive(int n){
        this.five += n;
    }
    public void addTen(int n){
        this.ten += n;
    }
    public double getMeasure() {
        int result = 0;
        int count = 0;
        for (int i = 0; i < 3; i++) {
            if (count < size) {
                if (i == 0) {
                    for (int j = 0; j < one; j++) {
                        result += 1;
                        count++;
                        if(count >= size){
                            break;
                        }
                    }
                } else if (i == 1) {
                    for (int j = 0; j < five; j++) {
                        result += 5;
                        count++;
                        if(count >= size){
                            break;
                        }
                    }
                } else if (i == 2) {
                    for (int j = 0; j < ten; j++) {
                        result += 10;
                        count++;
                        if(count >= size){
                            break;
                        }
                    }
                }
            } else {
                break;
            }
        }
        return result;
    }
}

//public class PiggyBank implements Measurable{
//
//    private int one;
//    private int five;
//    private int ten;
//    private int size;
//
//    public PiggyBank(){
//        this.size = 0;
//    }
//    public PiggyBank(int size) {
//        this.size = size;
//    }
//
//    public void addOne(int count){
//        one += calCount(count);
//    }
//    public void addfive(int count){
//        five += calCount(count);
//    }
//    public void addTen(int count){
//        ten += calCount(count);
//    }
//
//    @Override
//    public double getMeasure() {
//        return (one*1) + (five*5) + (ten*10);
//    }
//
//    public int calCount(int count){
//        if(size - count < 0){
//            count = size;
//            size = 0;
//        }
//        else{
//            size = size - count;
//        }
//        return count;
//    }
//
//    public void setSize(int count){
//        this.size = count;
//    }
//}
