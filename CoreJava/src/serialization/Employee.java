package serialization;

import java.io.Serializable;

public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private static String companyName;
	private transient int salary;
	
	
	public Employee(String name, String companyName, int salary) {
		super();
		this.name = name;
		this.companyName = companyName;
		this.salary = salary;
	}

	

	@Override
	public String toString() {
		
		return "Employee [name=" + name + ", companyName=" + companyName + ", salary=" + salary + "]";
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public static String getCompanyName() {
		return companyName;
	}



	public static void setCompanyName(String companyName) {
		Employee.companyName = companyName;
	}



	public int getSalary() {
		return salary;
	}



	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
	

}
