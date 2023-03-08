package Prob_Practice;

public class Palindrome_number {
    public static void main(String[] args) {

        int num = 1232;
        int a = num;
        int sum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            sum = sum * 10 + rem;
        }
        System.out.println(sum);

        if (sum == a) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
