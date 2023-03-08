package My_Practice;

import java.util.Scanner;

public class Fahrenheit_to_celsius {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Fahrenheit :  ");
        int a = input.nextInt();
        float b = (a - 32)*0.55555556f;
        System.out.println("The celsius value: "+ b);
    }
}