public class firstAndlastPosition {
    public static void main(String[] args) {

    }
    public int [] searchRange(int[] nums, int target){
        int start = 0;
        int end = nums.length ;

        while(start <= end){
            //find the middle element
            //   int mid = (start +end)/2; // (start+end) might exceed the int range
            int mid = start+(end - start)/2;

            if(target < nums[mid]){
                end = mid - 1;
            } else if (target > nums[mid]){
                start = mid + 1;
            }
            else {
                //ans found

            }

        }
     return searchRange(nums, target);
    }
}
