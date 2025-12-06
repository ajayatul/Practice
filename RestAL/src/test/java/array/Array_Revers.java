package array;

public class Array_Revers {
	 public static void main(String[] args) {
	        // Initialize the array
	        int a[] = {2, 5, 1, 4, 9};

	        // Reverse the array
	        for (int i = 0; i <= a.length / 2; i++) {
	            int temp = a[i];
	            a[i] = a[(a.length) - 1 - i];
	            a[(a.length) - 1 - i] = temp;
	        }

	        // Print the reversed array
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " "); // Added space for better readability
	        }
	    }
}
