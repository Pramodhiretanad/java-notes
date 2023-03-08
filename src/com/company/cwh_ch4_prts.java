package com.company;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class cwh_ch4_prts {
    public static void main(String[] args) {
       /* byte m1, m2, m3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Marks in Physics");
        m1 = sc.nextByte();
        System.out.println("Enter your Marks in Chemistry");
        m2 = sc.nextByte();
        System.out.println("Enter your Marks in Maths");
        m3 = sc.nextByte();
        float avg = (m1+m2+m3)/3.0f;
        System.out.println(avg);
        if(avg>=40 && m2>=33 && m3>=33){
            System.out.println("Congratulations you have been passed");
        }
        else {
            System.out.println("Sorry, you have not been promoted! Please try agian");
        } */
       // Problem;
//        int year;
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the Year");
//        year = sc.nextInt();
//        if(year%4==0){
//            System.out.println("Te given year is leap");
//            }
//        else{
//            System.out.println("The given year is not leap");
//        }
        // problem 6
        Scanner sc = new Scanner(System.in);
        System.out.println("Browse the website");
        String website = sc.next();
        if(website.endsWith(".org")){
            System.out.println("This is an organisational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is an Commercial website");
        }
        else if(website.endsWith(">in")){
            System.out.println("This is an Indian website");
        }
    }
}
