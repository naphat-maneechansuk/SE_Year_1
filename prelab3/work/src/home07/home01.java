package home07;


import java.util.Scanner;




public class home01 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        int [] num = new int[n];
        int count = 0;
        int plus = 0;
        int max = 0;
        int position = 0;
        int min = 0;
        int min2 = 0;
        for (int i = 0 ; i < n ; i++){
            num [i] = kb.nextInt();
            plus += num[i];
            max = num[i];
            min = num[i];
        }
        for (int j = 0; j < n; j++) {
            if (max <= num[j]){
                max = num[j];
            }
            if (min >=num[j]){
                min = num[j];
            }
        }
        for (int k = 0; k < n; k++) {
            if (min == num[k]){
                min2++;
            }
        }
        for (int k = 0; k < n; k++) {
            if (max == num[k]){
                position = k;
                break;
            }
        }
        System.out.println(plus);
        System.out.println(max);
        System.out.println(position);
        System.out.println(min2);
    }
}


