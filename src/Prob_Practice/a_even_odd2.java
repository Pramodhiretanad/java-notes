package Prob_Practice;

import java.util.Scanner;

public class a_even_odd2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int a = num % 2;
        if( a== 0){
            System.out.println("Even");
        } else{System.out.println("Odd");}
    }
}
