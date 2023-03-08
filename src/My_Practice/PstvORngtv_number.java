package My_Practice;

import java.util.Scanner;

public class PstvORngtv_number {
    public static void main(String[] args) {
       // Write a Java program to get a number from the user and print whether it is positive or negative.
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        if(a>0){
            System.out.println("Positive number" );
        } else {
            System.out.println("Negative number");
        }
    }
}
