package Prob_Practice;

public class reverse_string {
    public static void main(String[] args) {
        String a = "Pramod";
        String reverse = "";
        for (int i = a.length()-1; i >=0 ; i--) {
            reverse = reverse + a.charAt(i);
        }
        System.out.println(reverse);
        
    }
}
