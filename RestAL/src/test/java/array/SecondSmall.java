package array;

public class SecondSmall {

	public static void main(String[] args) {
		int[] arr = {12, 5, 7, 1, 9, 3};

        int smallest = arr[0];
        int secondSmallest = arr[0]; // initialize to first element

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i];

            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num > smallest && (secondSmallest == smallest || num < secondSmallest)) {
                secondSmallest = num;
            }
        }

        if (smallest == secondSmallest) {
            System.out.println("No second smallest element");
        } else {
            System.out.println("Second smallest number: " + secondSmallest);
        }
	}

}
