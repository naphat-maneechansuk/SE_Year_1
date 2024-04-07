package lab11_2;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;
    public class SalesReport {
        public static void main(String[] args) throws FileNotFoundException {
            int months = 0;
            double oneMonth;
            double totalSales = 0.0;
            double averageSales;
            try {
                Scanner kb = new Scanner(System.in);
                String filename = kb.nextLine();
                File file = new File(filename);
                Scanner inputFile = new Scanner(file);
                while (inputFile.hasNext()) {
                    oneMonth = inputFile.nextDouble();
                    totalSales += oneMonth;
                    months++;
                }
                inputFile.close();
                averageSales = totalSales / months;
                System.out.println("Number of months : " + months);
                System.out.println("Total Sales : " + totalSales);
                System.out.println("Average Sales : " + averageSales);
            }catch (FileNotFoundException ex){
                System.out.println("File is not exist");
            }catch (InputMismatchException ex1){
                System.out.println("Your input mismatch");
            }

    }

}
