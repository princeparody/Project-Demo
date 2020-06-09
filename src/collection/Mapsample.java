package collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Mapsample {
	
	public static void main(String[] args) {
		
		Map<Integer,String> friends = new TreeMap<>();
		
		friends.put(1,"Ajay");
		friends.put(2,"Anand");
		friends.put(3,"Boss");
		friends.put(4,"Ganesh");
		friends.put(5,"Ajay");
		friends.put(4,"Ram");
		
		System.out.println(friends);
		
		Set<Integer> s = friends.keySet();
		
		System.out.println(s);
		
		Collection<String> n = friends.values();
		
		System.out.println(n);
		
		boolean k = friends.containsKey(2);
		
		System.out.println(k);
		
		boolean v = friends.containsValue("Boss");
		
		System.out.println(v);
		
		friends.replace(5,"Raju");
		
		System.out.println(friends);
		
		String d = friends.get(5);
		
		System.out.println(d);
		
		Set<Entry<Integer,String>> o = friends.entrySet();
		
		for (Entry<Integer,String> x:o) {
			
			System.out.println(x);

		
			System.out.println(x.getKey());
			
			System.out.println(x.getValue());
	}
		}
	}

}
