package String;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TwoStringdoubchar {

	public static void main(String[] args) {
		 
		 String s1="I am Gyan";
		 String s2="I am Sanket";
		 String str1[]=s1.split("\\s");
		 String str2[]=s2.split("\\s");
		 
		// List<String>ls1=new ArrayList<>(Arrays.asList(str1));
	List<String> ls1=new ArrayList<>(Arrays.asList(str1));
	 
		 List<String>ls2=Arrays.asList(str2);
		 
		 ls1.retainAll(ls2);
		 System.out.println(ls1);
	}

}
