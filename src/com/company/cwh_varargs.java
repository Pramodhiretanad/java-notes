package com.company;

public class cwh_varargs {
//    static int sum(int a,int b){
//        return a+b;
//    }
    static int sum(int...arr){
        int result = 0;
        for(int a: arr){
            result +=a;
        }
        return result;

    }
    public static void main(String[] args) {
        System.out.println("Welcome to varargs problem");
        System.out.println("The sum of 4 and 5: " + sum(4,5));
        System.out.println("The sum of 4, 3 and 5: " + sum(4,3,5));
        System.out.println("The sum of 4,3,7 and 5: " + sum(4,3,7,5));
    }
}
