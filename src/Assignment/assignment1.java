package Assignment;

import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4==0){
            System.out.println("Yes,it is leap year");
        }
        System.out.println("No,its not");
    }
}
