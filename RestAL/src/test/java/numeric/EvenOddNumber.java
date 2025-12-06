package numeric;

public class EvenOddNumber {
	public static void main(String[] args) {
        int n = 100;
        int evencnt = 0;
        int oddcnt = 0;

        // Loop to find even numbers
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evencnt++;
                System.out.println("Even number ====" + i);
            }
        }
        System.out.println("Total Even numbers ====" + evencnt);

        // Loop to find odd numbers
        for (int i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                oddcnt++;
                System.out.println("Odd number ====" + i);
            }
        }
        System.out.println("Total Odd numbers ====" + oddcnt);
    }
}
