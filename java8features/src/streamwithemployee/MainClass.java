package streamwithemployee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MainClass {
	
	public static void main(String[] args) {
		List<Employee> employeesList=getListOfEmployees();
		
		List<String> names = employeesList.stream().filter(e -> e.getAge() > 18).map(e -> e.getName()).limit(3).collect(Collectors.toList());
		names.forEach(System.out::println);
		System.out.println("-----------------------------------");
		Employee em = employeesList.stream().reduce((e1, e2) -> (e1.getAge() > e2.getAge()) ? e1 : e2).get();
		//System.out.println(em);
		
		Employee maxAgeEmp = employeesList.stream().max(Comparator.comparing(Employee::getAge)).get();
		//System.out.println("maxAgeEmp "+maxAgeEmp);
		
		System.out.println("-----------------------------------");
		//Descending sorting
		List<Employee> sortList = employeesList.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).limit(3).collect(Collectors.toList());
		
		//Ascending sorting
		sortList = employeesList.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
		//sortList.forEach(System.out::println);
		
		//System.out.println("-------------------------------");
		String allnames = employeesList.stream().map(e -> e.getName()).collect(Collectors.joining(","));
		//System.out.println(allnames);
		
		//System.out.println("-----------------------------------------");
		
		Map < String, List < Employee >> empNameGroup = employeesList.stream().collect(Collectors.groupingBy(Employee::getName));
		
		//empNameGroup.forEach((k, v) -> System.out.println(k +" "+v));
		
	}

	
	public static List<Employee> getListOfEmployees() {
		 
        List<Employee> listOfEmployees = new ArrayList<>();
 
        Employee e1 = new Employee("Mohan", 24,Arrays.asList("Newyork","Banglore"));
        Employee e5 = new Employee("Mohan", 25,Arrays.asList("Newyork","Banglore"));
        Employee e2 = new Employee("John", 27,Arrays.asList("Paris","London"));
        Employee e3 = new Employee("Vaibhav", 32,Arrays.asList("Pune","Seattle"));
        Employee e4 = new Employee("Amit", 22,Arrays.asList("Chennai","Hyderabad"));
 
        listOfEmployees.add(e1);
        listOfEmployees.add(e5);
        listOfEmployees.add(e2);
        listOfEmployees.add(e3);
        listOfEmployees.add(e4);
 
        return listOfEmployees;
    }
}
