package My_Practice;

import java.util.Scanner;

public class Practice_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        for (int i = 1; i <=10  ; i++) {
            int b = a*i;
            System.out.println(a + " X " + i + " = " + b );

        }
    }
}
