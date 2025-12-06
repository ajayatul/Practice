package array;

import java.util.HashMap;
import java.util.Map;

public class count_No_Array {
	 public static void main(String[] args) {
	        // Initialize the array
	        int b[] = {2, 7, 1, 2, 7};

	        // Create a map to store frequencies
	        Map<Integer, Integer> map = new HashMap<>();

	        // Count occurrences of each number in the array
	        for (int i = 0; i < b.length; i++) {
	            int c = b[i];
	            if (map.containsKey(c)) {
	                int cnt = map.get(c);
	                map.put(c, ++cnt);
	            } else {
	                map.put(c, 1);
	            }
	        }

	        // Print the frequency map
	        System.out.println(map);
	       System.out.println("abc");
		    System.out.println("===============================");

	        // Count and print occurrences for each number from 0 to 99
	        for (int i = 0; i < 100; i++) {
	            int cnt = 0;
	            for (int j = 0; j < b.length; j++) {
	                if (i == b[j]) {
	                    cnt++;
	                }
	            }
	            if (cnt != 0) {
	                System.out.println(i + " == " + cnt);
	            }
	        }
	    }

}


