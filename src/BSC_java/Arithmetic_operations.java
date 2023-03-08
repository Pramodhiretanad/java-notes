package BSC_java;

public class Arithmetic_operations {
    static void addition(int num1,int num2){
        System.out.print("Addition of two numbers = ");
        System.out.println(num1+num2);
    }
    static void subtraction(int num1,int num2){
        System.out.print("Subtraction of two numbers = ");
        System.out.println(num1-num2);
    }
    static void multiplication(int num1,int num2){
        System.out.print("Multiplication of two = ");
        System.out.println(num1*num2);
    }
    static void division(int num1,int num2){
        System.out.print("Division of two numbers = ");
        System.out.println(num1/num2);
    }

    public static void main(String[] args) {
        addition(20,10);
        subtraction(40,30);
        multiplication(20,30);
        division(20,4);
    }
}