package Prob_Practice;

import java.util.Scanner;

public class Leap_year {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year = in.nextInt();
        int a = year % 4;
        if (a==0){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a leap year");
        }
    }
}
