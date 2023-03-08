package Pramod.Java;

public class withDuplicates {
    static int findPivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            // 4 cases over here
            if (mid < end && arr[mid] > arr[mid + 1]) {
                return mid;
            }
            if (mid > start && arr[mid] < arr[mid - 1]) {
                return mid - 1;
            }
            // if element at middle, start and end are equal then just skip the duplicate
            if (arr[mid]==arr[start]&& arr[mid]==arr[end]){
             // skip the duplicate
             // Note: what if these elements at start and end were the pivot
             // check if start is pivot
             if (arr[start] > arr[start+1]){
                 return start;
             }
             start++;
             // check whether end is pivot
                if (arr[end] < arr[end -1]){
                    return end -1;
                }
                end--;
            }
            else if (arr[start] < arr[mid] || (arr[start]== arr[mid] && arr[mid] > arr[start])){
                start++;
            } else {
                end = mid -1;
            }
        }
        return -1;
    }

}