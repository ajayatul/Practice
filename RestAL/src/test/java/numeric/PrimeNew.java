package numeric;

public class PrimeNew {
	public static void main(String[] args) {
        // Loop through numbers from 2 to 100
        for (int num = 2; num <= 100; num++) {
            int count = 0;

            // Check if the number is divisible by any number from 2 to num-1
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    break; // If divisible, it's not a prime number, so exit the loop
                }
            }

            // If count is 0, the number is prime
            if (count == 0) {
                System.out.println("Prime number === " + num);
            }
        }
    }
}
