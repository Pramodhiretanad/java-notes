public class Binary_search {
    public static void main(String[] args) {
        int [] arr = {-18, -12, -4, 0, 2, 3, 4 ,15, 16, 18, 22, 45, 89};
        int target = 45;
        int ans = binarySearch(arr, target);
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target){
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
        return -1;
    }
}
