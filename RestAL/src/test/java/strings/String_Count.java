package strings;

public class String_Count {
	public static void main(String[] args) {
        String a = "Hello";
        
        // Loop through both lowercase and uppercase letters
        for (char i = 'a', t = 'A'; i <= 'z' && t <= 'Z'; i++, t++) {
            int cnt = 0;  // Count for lowercase letters
            int m = 0;    // Count for uppercase letters
            
            // Iterate over each character in the string
            for (int j = 0; j < a.length(); j++) {
                // Check if the character in the string matches the lowercase letter
                if (i == a.charAt(j)) {
                    cnt++;
                }
                // Check if the character in the string matches the uppercase letter
                else if (t == a.charAt(j)) {
                    m++;
                }
            }
            
            // If there is at least one occurrence of the lowercase letter, print it
            if (cnt > 0) {
                System.out.println(i + " = " + cnt);
            }

            // If there is at least one occurrence of the uppercase letter, print it
            if (m > 0) {
                System.out.println(t + " = " + m);
            }
        }
    }
}
