package array;

public class Array_Sort {
	public static void main(String[] args) { 
		int a[]= {12,4,1,9,7}; 
		 System.out.println("local3 branch");
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++)
				if(a[i]<a[j]) 
				{ int temp=a[i]; 
				 System.out.println("local3 branch");
				a[i]=a[j];
				 System.out.println("local3 branch");
				a[j]=temp;}
			}
		for(int i=0;i<a.length;i++){
			System.out.print(a[i]+","); }
		System.out.println(); 
		//==============================================      
		int[] b = {5, 2, 8, 1, 9, 3,8}; 
		for (int i=0;i<b.length;i++ ) {
			 for(int j=0;j<b.length-1-i;j++) {
				 if(b[j]<b[j+1]) {
					  System.out.println("local2 branch");
					 int temp=b[j]; 
					 b[j]=b[j+1]; 
					  System.out.println("local2 branch");
					 b[j+1]=temp; }
				 }
			 }
		
		for(int i=0;i<a.length;i++) {
			System.out.print(b[i]);
		}
		
	}
	
}
