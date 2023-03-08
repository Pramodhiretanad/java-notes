package My_Practice;

import java.util.Scanner;

public class inchtoMeter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter value of inches : ");
        int a = input.nextInt();
        float b = a*0.0254f;
        System.out.println(a + " inch is "+ b + " Meter");

    }
}
