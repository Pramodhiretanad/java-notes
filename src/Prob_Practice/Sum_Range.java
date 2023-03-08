package Prob_Practice;

import java.util.Scanner;

public class Sum_Range {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        int num2 = in.nextInt();
        int sum = 0;
        for (int i = num1; i <=num2 ; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
}

