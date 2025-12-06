package strings;

public class Remove_duplicate_characters_from_String {

	public static void main(String[] args) {
		String input = "programming";
        String result = "";

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
       String s=   Character.toString(currentChar);

         
            if(!result.contains(s)) {
              result=  result + s;
            }
        }

        System.out.println("Original: " + input);
        System.out.println("Without duplicates: " + result);
	}

}
