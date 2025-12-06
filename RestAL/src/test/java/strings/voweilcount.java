package strings;

public class voweilcount {

	public static void main(String[] args) {
		char []a= {'a','e','i','o','u'};
		String b="atulee";
		
		for(int i=0;i<a.length;i++) {
			int count =0;
			for(int  j=0;j<b.length();j++) {
			char x=	b.charAt(j);
			if(a[i]==x) {
				count++;
			}
			}
			
			if(count>0)
			System.out.println(a[i]+"="+count);
		}
	}

}
