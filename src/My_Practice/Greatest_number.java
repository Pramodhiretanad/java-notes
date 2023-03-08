package My_Practice;

import java.util.Scanner;

public class Greatest_number {
    public static void main(String[] args) {
       // Take three numbers from the user and print the greatest number.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        int a = input.nextInt();
        System.out.println("Enter the second number");
        int b = input.nextInt();
        System.out.println("Enter the third number");
        int c = input.nextInt();
        if (a>b)
        if (a>c)
        System.out.println(a + "is the greater number");
        if(b>c)
        if(b>a)
        System.out.println(b + "is the greater number");
        if(c>a)
        if(c>b)
        System.out.println(c + "is the greater number");
//        if(a>c){
//            System.out.println(a + "is greater");
//        }else {
//            System.out.println(c + "is greater");
//        }
    }
}
