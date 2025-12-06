package strings;

public class String_Revers {
	public static void main(String[] args) {
        String a = "Atul Dhote";
        
        
        String[] words = a.split(" ");
        String result = "";

        for (String word : words) {
            char[] chars = word.toCharArray();
            String reversed = "";

            for (int i = chars.length - 1; i >= 0; i--) {
                reversed = reversed + chars[i];  // ✅ works
            }

            result = result + reversed + " ";
        }

        System.out.println(result);
    }
}
