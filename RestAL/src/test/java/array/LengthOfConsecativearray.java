package array;

public class LengthOfConsecativearray {

	public static void main(String[] args) {
		int[] arr = {1,2,3,0,1,2,3,4,5,5,5,6,7,8,0,3,4,5,6,7,7,8,9,9};

        int maxLen = 1; // at least one element is a subarray
        int currentLen = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1] + 1) {
                // continue consecutive sequence
                currentLen++;
            } else {
                // sequence broke, reset count
                currentLen = 1;
            }
            // update maximum length
            if (currentLen > maxLen) {
                maxLen = currentLen;
            }
        }

        System.out.println("Length of longest consecutive subarray: " + maxLen);

	}
	

}
