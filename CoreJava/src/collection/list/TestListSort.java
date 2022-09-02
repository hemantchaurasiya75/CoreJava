package collection.list;

import java.util.ArrayList;
import java.util.List;

public class TestListSort {
	
	/**
	 * Comparable and Comparator - Use for sorting
	 * Comparable has method public int compareTo(Employee o)
	 * Comparator has method public int compare(Employee o1, Employee o2)
	 * 
	 * 
	 * */

	public static void main(String[] args) {
		Employee e1 = new Employee("Adithya", 4, 1000);
		
		Employee e2 = new Employee("Binod", 3, 2000);
		Employee e3 = new Employee("Chotu", 2, 1000);
		Employee e4 = new Employee("Dhiru", 1, 30000);
		
		Employee e5 = new Employee("Adithya", 5, 4000);
		Employee e6 = new Employee("Binod", 3, 1000);
		
		
		List<Employee> list = new ArrayList<Employee>();
		
		list.add(e4);
		list.add(e3);
		list.add(e2);
		list.add(e1);
		
		list.add(e5);
		list.add(e6);
		
		System.out.println(list);
		
		list.sort(null);
		
		System.out.println(list);
		
		list.sort(new EmployeeIDComprator());
		
		System.out.println(list);
		
		
		// sort Emp by name then salary
		
	}
}
