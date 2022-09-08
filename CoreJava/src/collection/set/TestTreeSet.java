package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;


import common.usedclass.Employee;

public class TestTreeSet {
	
	/**
	 * TreeSet
	 * 1. Use NavigableMap to store element;
	 * 2. can't add null. Throws NullPointerException.
	 * 3. For sorting it uses + unique element identify 
	 * 		Comprator -When we can't modify class to be added in set.
	 * 				   To assign comparator pass in constructor on create TreeSet object.
	 * 		Compairebale - When we can modify class to be add in set. 
	 * 				This class need to implement Comparable interface
	 * 4. If Comprator + Compairebale used then preference goes to Comprator.
	 * 5. In TreeSet hasCode and equal method doesn't call.
	 * */
	public static void main(String[] args) {
//		Set<String> set = new TreeSet<String>();
//		
//		
//		set.add("A");
//		set.add("C");
//		set.add("Z");
//		set.add("B");
//		set.add(null);
//		
//		System.out.println(set);
		
		Set<Employee> set = new TreeSet<Employee>(new EmployeeIDComprator());
		
		Employee e1 = new Employee("David", 1, 1000);
		Employee e2 = new Employee("Tom", 2, 2000);
		
		set.add(e2);
		set.add(e1);
		
		
		System.out.println(set);
		
	}

}
