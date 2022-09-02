package collection.overview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class TestArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		list.add("Z");
		list.add("A");
		list.add("B");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("D");
		list.add("E");
		
		// order sort
		// 
		

		System.out.println(list);

		// [A, B, B, C, D, D, E]
		// [A, B, B2, C, D, D2, E]
		
		Collections.sort(list);
		
		
		
		
		
		//Vector<String> v = new Vector<String>();
		//v.add("A");

//		int j = 0;
//		int count = 0;
//
//		for (int i = 0; i < list.size(); i++) {
//
//			for (j = i; j < list.size(); j++) {
//
//				if (list.get(i) == list.get(j)) {
//					count++;
//					list.add(j + 1, list.get(i) + count);
//				}
//			}
		// 
//			count = 0;
//		}
//
//		
		
		
		System.out.println(list);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		


	}
}
