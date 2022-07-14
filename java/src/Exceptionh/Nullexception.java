package Exceptionh;

public class Nullexception {

	public static void main(String[] args) {
 
			String a=null;
			try {
				System.out.println(a.length());
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			finally {
				System.out.println("Program executes even though exception");   
			}
	}

}