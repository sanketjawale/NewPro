package Exceptionh;

public class program1 {

	public static void main(String[] args) {
 
		int a=10;
		int b[]=new int[5];
		
		try {
			b[7]=10;
			System.out.println(a/0);
			
		}
		catch(Exception e) {
			e.printStackTrace();
		//	System.out.println(e.getMessage());
			
			System.out.println("Executed");
		}
		 
	}

}
