package strings;

import java.util.HashMap;
import java.util.Map;

public class First_non_repeated_character_in_String {
public static void main(String[] args) {
	String str = "sawiss"; 
	char a[]=str.toCharArray();
	Map <Character,Integer>mp=new HashMap();
	for(int i=0;i<a.length;i++)
	{ char b=  a[i];
		if(mp.containsKey(b)) {
		int value=	mp.get(b);
		mp.put(b, ++value);
		}else {
			mp.put(b, 1);
		}
	}

     for(int i=0;i<a.length;i++) {
    	 char b=  a[i];
    	int c= mp.get(b);
    	if(c==1) {
    		System.out.println(a[i]);
    		break;
    	}
     }
	
}
}
