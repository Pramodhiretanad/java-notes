package Prob_Practice;

public class Armstrong_number {
    public static void main(String[] args) {
        int b = 156;
        int a = b;
        int sum = 0;
        int sum2 = 0;
        int sum3 = 0;
        sum = a % 10;
        a = a / 10;
        sum2 = a % 10;
        a = a / 10;
        sum3 = a;
        int result = (sum * sum * sum) + (sum2 * sum2 * sum2) + (sum3 * sum3 * sum3) ;
        System.out.println(result);

        if (result == b){
            System.out.println("Aemstrong");
        } else {
            System.out.println("Not");
        }
    }
}
