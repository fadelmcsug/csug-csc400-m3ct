
public class ArrayMissingIntSearch {

    public static void main(String[] args) {
        // example input arrays according to exercise specifications
        int[] arr1 = { 3, 4, 1, 6, 2 }; // array of size 5
        int[] arr2 = { 19, 7, 5, 11, 18, 6, 3, 20, 1, 15, 14, 12, 9, 2, 16, 21, 4, 10, 8, 13 }; // array of size 20
        
        System.out.println(searchMissingInt(arr1));
        System.out.println(searchMissingInt(arr2));
        
    }
    
    public static int searchMissingInt(int[] array) {
        int n = array.length;
        // array to determine if each integer exists. Initializing this array takes O(n) time
        boolean[] exists = new boolean[n + 1];
    	
        // this loop takes O(n) time
        for (int number : array) {
            // since the array starts from 0 by default, and the range of numbers in the input array start
            // from 1, the index of the exists array is offset by -1 to account for this difference
            exists[number - 1] = true; // takes O(1) time
        }
    	
        // this loop takes O(n+1) time to complete which is equal to O(n) ignoring constants
        for (int i = 0; i < n + 1; i++) {
            if (!exists[i]) {
                // when returning the value, the index is offset back by +1
                // to return the represented number in the range of the input array
                return i + 1; // takes O(1) time
            }
        }

        return -1; // default return value, not used
    }
}
