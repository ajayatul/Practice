package array;

public class Array_Max {

	public static void main(String[] args) { 
		int a[]= {2,1,9,1}; 
		int max=a[0];
		  System.out.println("local3 branch");
		for (int i=1;i<a.length;i++){
			if(a[i]>max) {
				max=a[i];}
			  System.out.println("local3 branch");
			}
		System.out.println("maximum number ==="+max); 
		//==========================================================
		int min=a[0]; 
		for (int i=1;i<a.length;i++)
		{
			if(a[i]<min) {
			min=a[i];
			  System.out.println("local2 branch");
			}
		}
		System.out.println("minimum number ==="+min);
	}
}
