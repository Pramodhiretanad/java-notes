package My_Practice;

public class SumOfNatu {
    static void SumOfNumbers(int num){
        int sum = 0;
        for (int i = 0; i <=num ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void main(String[] args) {
        SumOfNumbers(1000);
    }
}
