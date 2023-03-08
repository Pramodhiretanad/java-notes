package com.company;

public class floor_num {
    public static void main(String[] args) {

    int [] arr = {2, 3, 5, 9, 14, 16, 18};
    int target = 15;
    int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    // return the index; greatest number <=target
    static int binarySearch(int[] arr, int target){
        // but what if the target is smaller than the smallest element on array
        if (target >arr[arr.length-1]){
            return -1;
        }
        int start = 0;
        int end = arr.length ;

        while(start <= end){
            //find the middle element
            //   int mid = (start +end)/2; // (start+end) might exceed the int range
            int mid = start+(end - start)/2;

            if(target < arr[mid]){
                end = mid - 1;
            } else if (target > arr[mid]){
                start = mid + 1;
            }
            else {
                //ans found
                return mid;
            }

        }
        return end;
    }
}

