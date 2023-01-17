package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class Hashmapdemo {
	
	public static void main(String[]args) {
		HashMap hm = new HashMap();
		hm.put("Ram", 100);
		hm.put("Vishva", 101);
		hm.put("Abi", 102);
		hm.put("Madhu", 103);
		System.out.println(hm);
		Set s = hm.keySet();
		System.out.println(s);
		Collection s1 = hm.values();
		System.out.println(s1);
		Set s2 = hm.entrySet();
		System.out.println(s2);


		
		
	}

}
