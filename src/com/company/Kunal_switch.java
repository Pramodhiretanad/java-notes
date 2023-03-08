package com.company;

import java.util.Scanner;

public class Kunal_switch {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        String fruit = in.next();

//        if(Fruit.equals("mango")){
//            System.out.println("King of fruits:");
//        }
//        if (Fruit.equals("apple")){
//            System.out.println("a sweet fruit");
//        }

//
//        switch (fruit) {
//            case "Mango" -> System.out.println("King of fruits");
//            case "Apple" -> System.out.println("A sweet fruit");
//            case "Orange" -> System.out.println("Round fruit");
//            case "Grapes" -> System.out.println("Small fruit");
//            default -> System.out.println("Please enter the valid fruit");
//        }
        int day = in.nextInt();
        switch (day) {
            case 1 -> System.out.println("monday");
            case 2 -> System.out.println("tuesday");
            case 3 -> System.out.println("wednesday");
            case 4 -> System.out.println("thursday");
            case 5 -> System.out.println("friday");
            case 6 -> System.out.println("saturday");
            case 7 -> System.out.println("sunday");
        }

    }
}
