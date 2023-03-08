public class searrchIn_Mountain {
    public static void main(String[] args) {


    }
    int  search(int[] arr, int target){
        int peak = peakIndexInMountainArray(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if (firstTry != -1){
            return firstTry;
        }
        return orderAgnostic(arr, target, peak-1, arr.length-1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                // you are in dec part of array
                // this may be ans, but look at left
                // this is why end != mid + 1
                end = mid;
            } else {
                //you are in asc part of array
                start = mid + 1; // because we know that mid+1 element > mid element
            }
        }
        // in the end, start == end and pointing to the largest number because of the 2 checks above
        return start;
    }

    static int orderAgnostic(int[] arr, int target, int start, int end) {

        //find whether the array is sorted in ascending or not;
        boolean inAsc = inAsc = arr[start] < arr[end];

        while (start <= end) {
            //find the middle element
            //   int mid = (start +end)/2; // (start+end) might exceed the int range
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (inAsc) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;

            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
