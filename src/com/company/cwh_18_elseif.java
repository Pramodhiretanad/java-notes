package com.company;
import java.util.Scanner;

public class cwh_18_elseif {
    public static void main(String[] args) {
        System.out.println("Enter yor age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        switch(age){
            case 18:
                System.out.println("YOou are going to become an adult");
                break;
            case 24:
                System.out.println("You are going to join a job");
                break;
            case 60:
                System.out.println("You are going to get retired");
                break;
            default:
                System.out.println("Enjoy your Life");

        }




       /* if(age>56){
            System.out.println("you are Experienced!");
        }
        else if(age>46){
            System.out.println("you are semi-Experienced");
        }
        else if(age>36){
            System.out.println("you are semi-semi-Experienced");
        }
        else {
            System.out.println("you are Un-Experienced");
        }*/
    }
}
