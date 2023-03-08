package My_Practice;

public class Armstrong {
    static void armstrong(int num){
        int count = 0;
        for (int i = num; i >0 ; i++) {
            count++;
        }
        System.out.println(count);
    }

    public static void main(String[] args) {
        armstrong(1234);
    }
}
