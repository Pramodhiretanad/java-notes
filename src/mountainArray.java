public class mountainArray {
    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 6, 20, 4,  3, 1};
        System.out.println(peakIndexInMountainArray(arr));
    }
    public static int peakIndexInMountainArray(int[] arr){
        int start = 0;
        int end = arr.length-1;
        while (start < end){
            int mid = start + (end -start) / 2;
            if (arr[mid] >arr[mid+1]){
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
}
