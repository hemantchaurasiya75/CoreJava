package collection.overview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

public class TestArrayList {

	public static void main(String[] args) {

		List<String> list = new ArrayList<String>();

		// list.add("Z");
		list.add("A");
		list.add("B");
		list.add("B");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("D");
		list.add("E");

		System.out.println(list);

		// [A, B, B, B, C, D, D, E]
		// [A, B, B2, C, D, D2, E]
		
		
		for (int i = 0; i < list.size(); i++) {
			String element = list.get(i);
			if (Collections.frequency(list, element) > 1 && list.lastIndexOf(element) == i) {
				list.set(list.lastIndexOf(element), element + Collections.frequency(list, element));
			}
		}
	

		
//		int count = 1; 
//		for (int i = 0; i < list.size(); i++) { // 
//			
//			for (int j = i + 1; j < list.size(); j++) { // 
//
//				if (list.get(i) == list.get(j)) {
//					count++;
//					if(j==list.size()-1)
//					list.set(j, list.get(j) + count);
//
//				}
//			}
//			count = 1;
//		}
		
		/**
		 * step 1: take a variable to hold count of occurrence of element.
		 * step 2: loop through list till end and pick element from starting of index 0.
		 * step 3: take next element index element and compare with picked element
		 * 			if picked element matched with next element, increment count;
		 * step 4: repeat step 3 until inner loop end.
		 * step 5: if count > 1 replace picked 
		 * 
		 * 
		 * */
		
//		step-1:
//			for outer loop fistly target one element
//				then go to inner loop and check the element are same or not
//				if same then increase the count value and reset the index value
//				if not same the check next element till end of the link list
				
		System.out.println(list);

	}
}
