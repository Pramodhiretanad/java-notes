package com.company;

public class Cwh_15_pst3 {
    public static void main(String[] args) {
        // Problem 1
        String name = "Jack Parker";
        name = name.toLowerCase();
        System.out.println(name);
        // Problem 2
        String text = "To Lower Case";
        text = text.replace(" ","_");
        System.out.println(text);
        // Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>", "Pramod/Java");
        System.out.println(letter);
        //Problem 4

        String myString = "this string contains double  and triple space";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

        // Problem 5

        String Letter = "Dear Harry,\n\t This Java course is nice.\n\tTHanks!";
        System.out.println(Letter);

    }
}
