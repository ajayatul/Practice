package array;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_No_Array {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 1,1};  // Example array
	        
	        Map<Integer,Integer> seen = new HashMap<>();
	        Map<Integer,Integer> duplicates = new HashMap<>();

	        // Loop through the array to find duplicates
	        for (int i = 0; i < arr.length; i++) {
	        	 int c=arr[i];
	            if (seen.containsKey(c)) {
	            	int value=seen.get(c);
	            	seen.put(arr[i],++value);
	                duplicates.put(arr[i],value);  // If the element is already in seen, it's a duplicate
	            } else {
	                seen.put(arr[i],1);  // Otherwise, add it to the seen set
	              
	            }
	        }

	        // Print the duplicates
	        System.out.println("Duplicate elements: " + duplicates);
	    }
	}

	
