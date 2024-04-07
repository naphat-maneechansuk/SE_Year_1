package String;

import java.util.Scanner;

public class home3 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String rabbit1 = kb.next();
        String rabbit2 = kb.next();
        String rabbit3 = kb.next();
        int brethren = 0;
        int relative = 0;
        if (rabbit1.length() == rabbit2.length()) {
            if (rabbit1.charAt(0) == rabbit2.charAt(0)) {
                brethren++;
            } else {
                relative++;
            }
        }
        if (rabbit2.length() == rabbit3.length()) {
            if (rabbit2.charAt(0) == rabbit3.charAt(0)) {
                brethren++;
            } else {
                relative++;
            }
        }
        if (rabbit1.length() == rabbit3.length()) {
            if (rabbit1.charAt(0) == rabbit3.charAt(0)) {
                brethren++;
            } else {
                relative++;
            }
        }
        if (brethren == 3) {
            System.out.println("YES");
        } else if (relative >= 1) {
            System.out.println("Relatives");
        } else {
            System.out.println("NO");
        }
    }
}
