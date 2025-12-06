package strings;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_from_String {

	public static void main(String[] args) {
		String a="Better Butter";
        
        Map <Character,Integer> mp=new HashMap <Character,Integer>();
        Map <Character,Integer> duplicate=new HashMap <Character,Integer>();
        for(int i=0;i<a.length();i++) {
     	   
     	  char c=   a.charAt(i);
     	  
     	   if(mp.containsKey(c)) {
     		int value=   mp.get(c);
     	//int v2=	duplicate.get(c);
     		
     		mp.put(c, ++value);
     		duplicate.put(c, value);
     		   
     	     }else {
     	    	 mp.put(c, 1);
     	     }
        }
        
       

       for(char k:duplicate.keySet()) {
    	   System.out.println(k+"="+duplicate.get(k));
       }

	}

}
