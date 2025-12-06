package strings;

public class String_Split {
	public static void main(String[] args) { 
		String a="Atul Dhote"; 
		String []b= a.split(" "); 
		 for(String c:b) { 
			 // System.out.println(c);     
			 
			 for (int i=c.length()-1;i>=0;i--) {
				 System.out.print(c.charAt(i));
				 }
			 System.out.println();
			 }
	}
}
		
