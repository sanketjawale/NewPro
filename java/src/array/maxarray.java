package array;

public class maxarray {

	
		public static void main(String[] args) {
			System.out.println("max array program");
				int a[]= {4,5,10,25,48};
				
				int max=0;
				
				for(int i=0;i<a.length;i++) {
					
					if(a[i]>max) {
					  max=a[i];
					}
				}
				System.out.println("MAX number in array is: "+ max);
		}

	}


 
