package collection.iterable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestIteatorMain {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		
		Iterator<String> itr = list.iterator();
		
		while (itr.hasNext()) {
			
			System.out.println(itr.next());
			
//			if(itr.next().equals("C"))
//				break;
		}
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		for (String element : list) {
			System.out.println(element);
		}
		
		
		Set<String> set = new HashSet<String>();
		
		while (itr.hasNext()) {
			System.out.println(itr.next());
			
		}
		
		for (String element : list) {
			System.out.println(element);
		}
		
		
	}
}
