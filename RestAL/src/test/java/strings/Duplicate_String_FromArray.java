package strings;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_String_FromArray {
	public static void main(String[] args) {
        // Array of strings
        String a[] = {"Atul", "Dhote", "Tester", "Atul", "Tester"};
        
        // The string to check, though it is not used in this code.
        String b = "atul"; 
        
        // Creating a map to store word frequency counts
        Map<String, Integer> map = new HashMap<String, Integer>();

        // Iterate through the array of strings
        for (int i = 0; i < a.length; i++) {
            String d = a[i];

            // If the word is already in the map, increment its count
            if (map.containsKey(d)) {
                int cnt = map.get(d);
                map.put(d, ++cnt); // Increment and put back in map
            } 
            // If the word is not in the map, add it with an initial count of 1
            else {
                map.put(d, 1);
            }
        }

        // Output the word frequency map
        System.out.println(map);
    }
}
