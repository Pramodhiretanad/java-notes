package BSC_java;

public class Palibrome {
    static void palindrome(int num){
        int newNumber = 0, remainder, temp;
        temp = num;
        while (temp!= 0){
            remainder = temp%10;
            newNumber = newNumber*10 + remainder;
            temp = temp/10;
        }
        if (newNumber == num)
            System.out.println(num + " is palindrome");
        else
            System.out.println(num + " is not palindrome");
    }

    public static void main(String[] args) {
        palindrome(12321);
    }
}
