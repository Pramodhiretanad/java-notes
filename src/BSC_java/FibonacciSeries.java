package BSC_java;

public class FibonacciSeries {
    static void fibonacci(int num){
        int f1,f2 = 0,f3 = 1;
        for (int i = 1; i <=num ; i++) {
            System.out.println(f3);
            f1 = f2;
            f2 = f3;
            f3 = f1+f2;
        }
    }

    public static void main(String[] args) {
        int num = 8;
        if (num>0){
            fibonacci(num);
        }
        else{
            System.out.println("No.should be greater than zero");
        }
    }
}
