package com.company;

import java.util.Scanner;

public class kunal_nestedswitch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int empID = in.nextInt();
        String Department = in.next();

        switch (empID) {
            case 1 -> System.out.println("Pramod Hiretanad");
            case 2 -> System.out.println("Rohan Kade");
            case 3 -> {
                System.out.println("Naveen Iliger");
                switch (Department) {
                    case "IT" -> System.out.println("IT department");
                    case "Management" -> System.out.println("Management Department");
                    default -> System.out.println("no department");
                }
            }
            default -> System.out.println("Enter correct ID");
        }
    }
}
