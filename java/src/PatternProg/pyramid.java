package PatternProg;

public class pyramid {

	public static void main(String[] args) {
		int n=5;
		for(int i=0;i<=n;i++) {
			for(int j=0;j<=9;j++) {
				
				if(j>n-i && j<n+i) {
					
					System.out.print("*");
				}
				else
					System.out.print(" ");	
			}
			System.out.println();
		}
}



	}


