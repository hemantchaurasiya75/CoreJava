package collection.list;

import common.usedclass.Employee;

public class TestUniqueList {
	
	public static void main(String[] args) {
		UniqueList<String> sList = new UniqueList<>();
		 
		sList.add("A");
		sList.add("B");
		sList.add("A");
		sList.add("C");
		
		System.out.println(sList);
		
		// [A, B, C]
		
		Employee e1 = new Employee("Hemant", 1, 100000);
		Employee e2 = new Employee("Tom", 2, 100000);
		Employee e3 = new Employee("Jerry", 1, 100000);
		
		UniqueList<Employee> list = new UniqueList<>(); 
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		
		System.out.println(list);
		
	}
}
