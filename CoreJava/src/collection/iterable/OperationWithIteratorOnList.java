package collection.iterable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class OperationWithIteratorOnList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");

		Iterator<String> itr = list.iterator();

//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());
//		System.out.println(itr.next());

//		while (itr.hasNext()) {
//			System.out.println("printin...");
//			
//			System.out.println(itr.next());
//			
//			if(itr.next() == "C") {
//				System.out.println("breaking...");
//				break;
//			}
//				
//		}
//		
//		System.out.println(list);

//		while (itr.hasNext()) {
//			String element = itr.next();
//			
//			if(element.equals("C"))
//				itr.remove();
//			
//		}
//		
//		System.out.println(list);

//		while (itr.hasNext()) {
//			String element = itr.next();
//			
//			if(element.equals("C")) {
//				// list.remove(element);
//				//System.out.println(list.contains("C"));
//			}
//				
//
//		}

//		Exception in thread "main" java.util.ConcurrentModificationException
//		at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
//		at java.util.ArrayList$Itr.next(ArrayList.java:859)
//		at collection.iterable.OperationWithIteratorOnList.main(OperationWithIteratorOnList.java:55)

//		while (itr.hasNext()) {
//			list.add("Z");
//		}
//		System.out.println(list);
//		
//		Exception in thread "main" java.lang.OutOfMemoryError: Java heap space
//		at java.util.Arrays.copyOf(Arrays.java:3210)
//		at java.util.Arrays.copyOf(Arrays.java:3181)
//		at java.util.ArrayList.grow(ArrayList.java:265)
//		at java.util.ArrayList.ensureExplicitCapacity(ArrayList.java:239)
//		at java.util.ArrayList.ensureCapacityInternal(ArrayList.java:231)
//		at java.util.ArrayList.add(ArrayList.java:462)
//		at collection.iterable.OperationWithIteratorOnList.main(OperationWithIteratorOnList.java:65)

//		while (itr.hasNext()) {
//			String element = itr.next();
//			
//			System.out.println(element);
//			
//			if(element.equals("C"))
//				list.add("Z");
//			
//		}
//		
//		Exception in thread "main" java.util.ConcurrentModificationException
//		at java.util.ArrayList$Itr.checkForComodification(ArrayList.java:909)
//		at java.util.ArrayList$Itr.next(ArrayList.java:859)
//		at collection.iterable.OperationWithIteratorOnList.main(OperationWithIteratorOnList.java:80)

//		Set<String> set = new HashSet<String>();
//		set.add("A");
//		set.add("B");
//		set.add("C");
//		set.add("D");
//		set.add("E");
//		set.add("F");
//
//		Iterator<String> itr2 = set.iterator();
//
//		while (itr2.hasNext()) {
//			String element = itr2.next();
//
//			System.out.println(element);
//
//			if (element.equals("C")) {
//				System.out.println(set.size());
//				//set.add("Z");
//			}
//				
//
//		}
//		
//		Exception in thread "main" java.util.ConcurrentModificationException
//		at java.util.HashMap$HashIterator.nextNode(HashMap.java:1445)
//		at java.util.HashMap$KeyIterator.next(HashMap.java:1469)
//		at collection.iterable.OperationWithIteratorOnList.main(OperationWithIteratorOnList.java:109)
		
//		System.out.println(set);

	}

}
