package array;

public class copyarray {

	public static void main(String[] args) {

		int a[]= {2,4,3,6,5};
		int b[]=new int[a.length];
		
		for(int i=0;i<a.length;i++) {
			b[i]=a[i];
			
		}
		System.out.println();
		for(int i=0;i<b.length;i++) {
			System.out.print( b[i]+ " ");
		}
		
	}

}
