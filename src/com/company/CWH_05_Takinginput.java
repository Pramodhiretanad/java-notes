package com.company;
import java.util.Scanner;

public class CWH_05_Takinginput {
    public static void main(String[] args) {
        System.out.println("Taking Input From User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Marks obtained for Eng");
        int a = sc.nextInt();
        System.out.println("Enter the Marks obtained for kan");
        int b = sc.nextInt();
        System.out.println("Enter the Marks obtained for Maths");
        int c = sc.nextInt();
        System.out.println("Enter the Marks obtained for SSt");
        int d = sc.nextInt();
        System.out.println("Enter the Marks obtained for Science");
        int e = sc.nextInt();
        float sum= a + b + c + d + e;
        System.out.println(sum);
        float prt = (sum)/500;
        System.out.println(prt);
        float prt1 = prt*100;
        System.out.println(prt1);
    }
}
