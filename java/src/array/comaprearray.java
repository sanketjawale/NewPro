package array;

public class comaprearray {

	public static void main(String[] args) {

			int a[]= {1,2,2,1,1,1,2,2,1,2,1,2};
			
			for(int i=0;i<a.length;i++) {
				for(int j=i+1;j<a.length;j++) {
					if(a[i]>a[j]) {
						int temp=a[i];
						a[i]=a[j];
						a[j]=temp;
					}
				}
				 System.out.print(a[i]+ " ");
				
			}
			
			System.out.println("Array compare success");
			
	}

}
