package collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
//		map.put(1, "D");
//		System.out.println(map.put(1, "E")); // D
//		System.out.println(map); // E
		
//		map.put(null, "A");
//		map.put(null, "B");
//		map.put(1, null);
//		map.put(2, null);
//		
//		System.out.println(map); // {null=B, 1=null, 2=null}
		
		
//    	Map<Project, ProjectManager> map = new HashMap<K, V>();
	
		
		
		// map.put(p1, ProjectManager)
		// map.put(p2, ProjectManager)
		
		
		map.put(1, "A");
		map.put(2, "B");
		
		Set<Integer> set = map.keySet();
		
		Iterator<Integer> itr = set.iterator();
		
		while(itr.hasNext()) {
			Integer i = itr.next();
			
			if(i == 2)
				set.remove(2);
		}
		
		
		System.out.println(set);
		
		
	}

}
