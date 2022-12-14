package collection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import common.usedclass.Employee;

public class TestHashSet {
	
	/**
	 * HashSet
	 * 1. internally used hashmap put mathod to store
	 * 2. key as passed element in add(element), value as new Object();
	 * 3. to identify unique element
	 * 		calls hascode:
	 * 			if hashcode same then calls equals
	 * 			if hashcode not same then equal doesn't call
	 * 4. if identified duptpicate element then reject to store and returns false
	 * 5. if identified unique element then store and return true.
	 * 6. In case add multiple null value then only one null will be add
	 * 7. doesn't maintain insertion order.
	 * 8. default initial capacity (16) and load factor (0.75)
	 * 9. when initial capacity reached (12) then size grow by double.
	 * */
	public static void main(String[] args) {
//		Set<String> set = new HashSet<String>(); 
//		
//		String a1 = new String("A");
//		String a2 = new String("A");
//		
//		System.out.println(a1.hashCode());
//		System.out.println(a2.hashCode());
//		
//		System.out.println(set.add("A")); // true
//		System.out.println(set.add("A")); // false
		
		// set = A
		
		Set<Employee> empSet = new HashSet<Employee>();
		
		Employee e1 = new Employee("David", 1, 1000);
		Employee e2 = new Employee("Tom", 2, 2000);
		
		empSet.add(e1);
		empSet.add(null);
		empSet.add(e2);
		
		empSet.add(null);
		
		System.out.println(empSet);
		
		
		
		
	}

}
