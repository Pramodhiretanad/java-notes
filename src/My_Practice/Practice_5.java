package My_Practice;

import java.util.Scanner;

public class Practice_5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = 60;
        int b = 34;
//        int c = 10;
//        float d = ((a+b+c)/3f);
//        System.out.println(d);
//

        int temp = a;
        a = b;
        b = temp;
        System.out.println(b);

    }
}
