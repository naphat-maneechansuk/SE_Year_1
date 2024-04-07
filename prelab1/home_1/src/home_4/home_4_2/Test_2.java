package home_4.home_4_2;

import java.util.Scanner;

public class Test_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int distance = kb.nextInt();
        String type = kb.next();
        Logistics log;
        if(type.equalsIgnoreCase("Road")){
            log = new RoadLogistics();
            double price = log.planDelivery( distance);
            System.out.printf("%.2f\n", price);
            log.deliver();
        }else if(type.equalsIgnoreCase("Sea")){
            log = new SeaLogistics();
            double price = log.planDelivery(distance);
            System.out.printf("%.2f\n", price);
            log.deliver();
        } else if (type.equalsIgnoreCase("Air")) {
            log = new AirLogistics();
            double price = log.planDelivery(distance);
            System.out.printf("%.2f\n", price);
            log.deliver();
        }
    }
}
