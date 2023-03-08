package My_Practice;

public class factorial {
    static void Factorial(int num){
        int count = 1;
        for (int i = 1; i <= num; i++) {
            count = count*i;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        Factorial(4);
    }
}
