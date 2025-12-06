package numeric;

public class StringInteger {
	public static void main(String[] args) {
        // Initialize two string variables containing numbers as text
        String aa = "10";
        String bb = "20";

        // Convert strings to integers
        int num11 = Integer.parseInt(aa);
        int num22 = Integer.parseInt(bb);

        // Add the numbers
        int sum = num11 + num22;

        // Output the result
        System.out.println("Sum of 10 and 20: " + sum);

        // ====================================

        // Strings containing numbers mixed with text
        String a = "atul10dhote";
        String b = "shote23atu";

        // Extract numbers from the strings
        int num1 = extractNumber(a);
        int num2 = extractNumber(b);

        // Add the numbers
        int sum2 = num1 + num2;

        // Output the result
        System.out.println("Sum of extracted numbers: " + sum2);
    }

    // Method to extract a number from a string
    public static int extractNumber(String str) {
        // Regular expression to find and remove all non-numeric characters
        String numberString = str.replaceAll("[^0-9]", "");

        // Convert the string to an integer and return the result
        return Integer.parseInt(numberString);
    }
}
