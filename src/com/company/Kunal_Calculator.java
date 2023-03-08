package com.company;

import java.util.Scanner;

public class Kunal_Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;
        while (true){
            System.out.print("Enter the operator : ");
            char op = in.next().trim().charAt(0);
            if (op == '+' || op=='_' || op == '*' || op == '/' || op == '%'){
                int num1 = in.nextInt();
                int num2 =  in.nextInt();

                if (op == '+'){
                    ans = num1 + num2;
                }
                if (op == '-'){
                    ans = num1 -num2;
                }
                if ( op == '*'){
                    ans = num1*num2;
                }
                if (op == '/'){
                    if (num1 !=0){

                    }
                    ans = num1 /num2;
                }
                if ( op == '%'){
                    ans = num1%num2;
                }
            } else {
                System.out.println("invalid");
                break;
            }
            System.out.println(ans);
        }
    }
}
