package Prob_Practice;

public class GreaterOf_3 {
    public static void main(String[] args) {
//        int a = 12;
//        int b = 9;
//        int c = 14;
//        if (a > b && a > c){
//            System.out.println(a);
//        }
//        else if (b > c && b > a){
//            System.out.println(b);
//        }
//        else {
//            System.out.println(c);
//        }

        int a = 110, b = 20, c = 30;
        int temp;
        int result;
        temp = Math.max(a, b);
        result = Math.max(temp, c);
        System.out.println(result);
    }
}
