package com.company;

import java.util.Locale;

public class CWH_14_string_methods {
    public static void main(String[] args) {
        String name = "Shivabasappa  Hiretanad";
        String shi = name.toUpperCase();
        System.out.println(shi);


        String nonTrimmedString ="Harry";
        System.out.println(nonTrimmedString.trim());
     //   System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.substring(1,5));
    }
}
