package My_Practice;

import java.util.Scanner;

public class Add_digits {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int a = input.nextInt();
        int num1 = a%10;
        int rem1 = a /10;
        int num2 = rem1 % 10;
        int rem2 = rem1/10;
//        int num3 = rem2 / 10;
        System.out.println(num1 + num2 + rem2);


        }
    }

