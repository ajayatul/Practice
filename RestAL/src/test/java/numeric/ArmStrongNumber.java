
package numeric;

public class ArmStrongNumber {
	public static void main(String[] args) {
        // Initialize the number to check if it's Armstrong
        int n = 153;
        int summ = 0;
		/*
		 * int cnt = 0; int dum = n;
		 */

        // Print separator
        System.out.println("=====================");

        // Count the number of digits
		/*
		 * while (dum > 0) { dum = dum / 10; cnt++; }
		 * 
		 * // Print the number of digits
		 * System.out.println("========================Digit ===" + cnt);
		 */

        // Calculate the sum of cubes of digits
        for (int j = n; j > 0; j = j / 10) {
            int rem = j % 10;
            summ = summ + rem * rem * rem;
            System.out.println("========================Reminder ===" + rem);
        }

        // Print the sum of cubes
        System.out.println("========================final ===" + summ);

        // Check if the number is Armstrong
        if (summ == n) {
            System.out.println(n + " is an Armstrong number.");
        } else {
            System.out.println(n + " is not an Armstrong number.");
        }
    }

}
