package common.usedclass;



public class Employee implements Comparable<Employee>{


	
	private String name;
	private int empId;
	private long salary;
	
	@Override
	public int hashCode() {

		System.out.println("EMP hash Code called ");
		return super.hashCode();
	}
	
	public Employee(String name, int empId, long salary) {
		super();
		this.name = name;
		this.empId = empId;
		this.salary = salary;
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

	@Override
	public boolean equals(Object obj) {
		System.out.println("Emp equal called");
		
		// step 1: check obj instanceof Employee class. if not return false;
		if(!(obj instanceof Employee)) {
			return false;
		}
		
//		// step 2: cast obj into Employee 
		Employee emp = (Employee) obj;
//		
//		
//		// step 3: compare obj empId with this empId
//		// step 4: if obj.empId same with this.empId return true otherwise return false.
		return this.empId == emp.getEmpId();
		
//		if(this.empId==emp.getEmpId()) {
//			return true;
//		}
//		return false;
		
		
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee o) {
		
		return 0;
	}
	
	


}
