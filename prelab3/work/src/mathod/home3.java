package mathod;

import java.util.Scanner;

public class home3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String subject[] = new String[n];
        double credit[] = new double[n];
        double grades[] = new double[n];
        for (int i = 0; i < n; i++) {
            subject[i] = kb.next();
            credit[i] = kb.nextInt();
            grades[i] = kb.nextDouble();
        }
        double gpa = calGPA(n, credit, grades);
        System.out.printf("%.2f",gpa);
    }
    public static double calGPA(int n, double[] credits, double[] grade) {
        double totalCredit = 0;
        double Sum = 0;
        for (int i = 0; i < n; i++) {
            totalCredit += credits[i];
            Sum += credits[i] * grade[i];
        }
        double gpa = Sum / totalCredit;
        return gpa;
    }
}
