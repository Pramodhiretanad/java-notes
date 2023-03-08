package Prob_Practice;

public class Digits_sum {
    public static void main(String[] args) {
        int a = 12345, sum = 0;
        while (a != 0){
            sum += a % 10;
            a = a / 10;

        }
        System.out.println(sum);
    }
}
