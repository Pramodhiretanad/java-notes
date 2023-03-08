package Prob_Practice;

public class Anagram {
    public static void main(String[] args) {
        String a = "Angle";
        String b = "Angel";
        Object c = 0;
        for (int i = a.length(); i > 0; i++) {
            c = a.charAt(i);

        }
        System.out.println(c);
        if (c == a){
            System.out.println("Two words are anagram");
        }else {
            System.out.println("Not anagram");
        }

    }

}
