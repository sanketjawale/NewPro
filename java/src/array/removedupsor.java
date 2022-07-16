package array;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class removedupsor {

	public static void main(String[] args) {
		 int a[] = {5,2,6,8,6,7,5,2,8};
	     Arrays.sort(a);
	        // Function call
	        removeDuplicates(a);
	        
	}

	public static void removeDuplicates(int[] a)
    {
        LinkedHashSet<Integer> set
            = new LinkedHashSet<Integer>();
 
        // adding elements to LinkedHashSet
        for (int i = 0; i < a.length; i++)
            set.add(a[i]);
 
        // Print the elements of LinkedHashSet
        System.out.print(set);
        
       // Arrays.sort(set);
        
        
        
    }
}
