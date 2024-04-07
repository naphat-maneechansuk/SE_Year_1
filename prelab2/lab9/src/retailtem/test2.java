package retailtem;

public class test2 {
    private static void showPrice(RetailItem item) {
        System.out.printf("Price: $%,.2f\n", item.getRetailPrice());
    }
    public static void main(String[] args) {
        CompactDisc c = new CompactDisc("Greatest Hits","Joe Looney Band",18.95);
        DvdMovie m = new DvdMovie("Joker","122",12.95);
        System.out.println("Item #1: "+c.getTitle());
        showPrice(c);
        System.out.println("Item #2: "+m.getTitle());
        showPrice(m);
    }
}
