package Prob_Practice;

import java.util.Scanner;

public class Prime_number {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = a/a;
        if (b == 1){
            System.out.println("Prime Number");
        }
        else {
            System.out.println("Not a prime number");
        }
    }
}
