package Prob_Practice;

import java.util.Scanner;

public class a_num_1 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int num = input.nextInt();
            if (num < 0){
                System.out.println("num is negative ");
            } else {
                System.out.println("Num is Positive");
            }
        }
}
