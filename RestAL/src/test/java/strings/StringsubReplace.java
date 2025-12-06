package strings;

public class StringsubReplace {
	 public static void main(String[] args) {
		    
   	  String IP = "ABCDEFG";
         String result = "";
   	
   	

   	for(int i=0;i<IP.length();i++){
   	    String d="";
   	    if(i%2==0 && i+1!=IP.length()){
   	        char temp=IP.charAt(i+1);
   	       d= d + temp;
   	       d= d+IP.charAt(i);
   	      };
   	      result=result+d;
   	    }
   	   
   	 System.out.println(result) ;
}
}