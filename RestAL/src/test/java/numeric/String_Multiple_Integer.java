package numeric;

public class String_Multiple_Integer {
	public static void main(String[] args) {
        String a = "atul10dho20te";
        String b = "shote23atu";

        // Replace all non-digit characters with spaces in string 'a'
        String c = a.replaceAll("[^0-9]", " ");
        System.out.println("String after replacing non-digits: " + c);

        // Split the string into substrings based on spaces
        String[] d = c.split(" ");
        int sum1 = 0;

        // Iterate through the split string array to sum the numbers
        for (String e : d) {
            // Skip any empty strings (if there are consecutive spaces or leading/trailing spaces)
            if (e.isBlank()) {
                // Do nothing for blank entries
            } else {
                // Convert the string number to integer and add to sum
                int m = Integer.parseInt(e);
                sum1 = sum1 + m;
                System.out.println("Number found: " + e + " =======");
            }
        }

        // Print the total sum of numbers extracted
        System.out.println("Total sum of numbers: " + sum1);
    }
}
