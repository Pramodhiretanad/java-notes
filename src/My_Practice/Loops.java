package My_Practice;

public class Loops {
    static void tables(int num,int a){
        for (int i = 1; i <=a; i++) {
            System.out.println(num + " X "+i+" = " + num*i );
        }
    }
    public static void main(String[] args) {
        tables(6,10);
    }
}
