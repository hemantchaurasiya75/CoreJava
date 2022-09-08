package collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

import common.usedclass.Employee;

public class TestLinkedHashSet {
	
	/**
	 * LinkedHashSet
	 * 1. internally used LinkedHashMap put mathod to store
	 * 2. key as passed element in add(element), value as new Object();
	 * 3. to identify unique element
	 * 		calls hascode:
	 * 			if hashcode same then calls equals
	 * 			if hashcode not same then equal doesn't call
	 * 4. if identified duptpicate element then reject to store and returns false
	 * 5. if identified unique element then store and return true.
	 * 6. if add null, it store at first place. 
	 * 		In case add multiple null value then only one null will be add
	 * 7. maintain insertion order.
	 * 8. default initial capacity (16) and load factor (0.75)
	 * 9. when initial capacity reached (12) then size grow by double.
	 * */
	public static void main(String[] args) {
		LinkedHashSet<Employee> empSet = new LinkedHashSet<>();
		
		Employee e1 = new Employee("David", 1, 1000);
		Employee e2 = new Employee("Tom", 2, 2000);
		
		empSet.add(e1);
		empSet.add(null);
		empSet.add(e2);
		
		empSet.add(null);
		
		System.out.println(empSet);
	}

}
