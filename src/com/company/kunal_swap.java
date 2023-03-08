package com.company;

import java.util.Arrays;

public class kunal_swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " " + b);


        String name = "Pramod/Java";
        changeName();
        System.out.println(name);
    }
    static void changeName() {
        String name = "Rohan Kadi";
        // Changing the value
        int[] arr = {1,2,3,4,5,5};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums){
        nums[0] = 99;
    }
}
