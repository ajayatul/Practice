package strings;

public class OnlyString {

	public static void main(String[] args) {
		 String a = "atul10Dho20te";
	        StringBuilder output = new StringBuilder();

	        for (int i = 0; i < a.length(); i++) {
	            char ch = a.charAt(i);
	            if (!Character.isDigit(ch)) {
	                output.append(ch);
	            }
	        }

	        System.out.println(output.toString()); // Output: atulDhote

	}

}
