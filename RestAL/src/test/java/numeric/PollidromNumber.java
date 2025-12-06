package numeric;

public class PollidromNumber {
	public static void main(String[] args) {
        int n = 333;
        int sum = 0;
        int temp = n;

        // Loop to reverse the number
        for (int i = n; i > 0; i = i / 10) {
            int rem = i % 10;
            sum = sum * 10 + rem;
            System.out.println("Palindrome number === " + sum);
        }

        // Check if the original number is equal to the reversed number
        if (n == sum) {
            System.out.println("============== Number is a Palindrome: " + temp);
        } else {
            System.out.println("============== Not a Palindrome: " + temp);
        }
    }
}
