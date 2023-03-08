public class smallest_letter {
    public static void main(String[] args) {

    }

    //return the index of smallest no>=target
    static int smallestletter(int[] letters, int target) {
        // but what if the target is greater than the greatest number in the array

        int start = 0;
        int end = letters.length;

        while (start <= end) {
            //find the middle element
            //   int mid = (start +end)/2; // (start+end) might exceed the int range
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;

            } else {
                start = mid + 1;
                //ans found

            }

        }
        return letters[start % letters.length];
    }
}