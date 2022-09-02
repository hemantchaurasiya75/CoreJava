package collection.list;

public class Employee implements Comparable<Employee>{
	
	private String name;
	private int empId;
	private long salary;
	
	
	
	public Employee(String name, int empId, long salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
	}



	@Override
	public int compareTo(Employee o) {
		return this.getName().compareTo(o.getName()); 
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getEmpId() {
		return empId;
	}



	public void setEmpId(int empId) {
		this.empId = empId;
	}



	public long getSalary() {
		return salary;
	}



	public void setSalary(long salary) {
		this.salary = salary;
	}
	
	

}
