package com.company;

import java.util.Scanner;

public class kunal_fibo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;
        while (count <=n){
            int num = b;
            b = b+a;
            a = num;
            count++;
        }
        System.out.println(b);
    }
}
