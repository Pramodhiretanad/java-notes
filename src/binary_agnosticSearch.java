public class binary_agnosticSearch {
    public static void main(String[] args) {

    }

    static int ordeeAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length;
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