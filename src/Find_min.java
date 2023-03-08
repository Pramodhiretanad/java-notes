public class Find_min {
    public static void main(String[] args) {
       int[]arr = {-18, 12, -7, 3, 14, 28};
        System.out.println(min(arr,0, 5));
    }
    static int min(int[] arr,int start,int end){
        int ans = arr.length;
        for (int i = start; i <end ; i++) {
            if (arr[i]<ans){
                ans = arr[i];
            }
        }
        return ans;

    }

}

