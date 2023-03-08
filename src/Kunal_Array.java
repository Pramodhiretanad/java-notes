import java.util.Arrays;
import java.util.Scanner;



public class Kunal_Array {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
////        syntax
////       datatype[]variable name = new datatype[size];
//        int[] ros ; // declaration of array. ros is getting defined in stack
//        ros = new int[5]; // initialization: actually here object is being created in the memory(heap).
//      //  System.out.println(ros[3]);
//        String[] arr = new String[4];
//        System.out.println(arr[3]);
//        int[] arr = new int[5];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = in.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int j : arr) {
//            System.out.print(j + " ");
//        }
        // Passing in Function
        int[] nums = {3, 4, 5, 12};
        System.out.println(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));
    }
    static void change(int[] nums) {
        nums[0] = 99;
    }
}
