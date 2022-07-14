package Map;

import java.util.HashMap;

public class HashM {

	public static void main(String[] args) {
 
			HashMap<Integer,String> hm=new HashMap<Integer,String>();
			hm.put(1, "raju");
			hm.put(3,"dk");
			hm.put(2, "pk");
			hm.put(4, "RK");
			hm.put(null, "kj");
			hm.put(5, null);
			hm.put(6, null);
			
			System.out.println(hm);
			System.out.println(hm.keySet());
			System.out.println(hm.values());
			
//			for(Object obj:hm.keySet()) {
//				System.out.println(obj+" "+hm.get(obj));
//			}
//			
//			for(Object obj1:hm.values()) {
//				System.out.println(obj1);
//			}
	}

}
