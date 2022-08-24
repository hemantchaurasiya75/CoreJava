package method.equals.and.hashcode.and.tostring;


public class Employee {

	private String name;
	private double salary;
	
	
	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	
	@Override
	public String toString() {
		return String.format("Employee name = %s, salary = %s", name, salary);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		long temp;
		temp = Double.doubleToLongBits(salary);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}


	// equal - 
	// 1. Translative - a.equal(b), b.equal(c) === a.equal(c)
	// 2. Reflexive = a != null. a.equal(a) = true
	// 3. Symmetric System.out.println(pEmp2.equals(pEmp)); true
	// 4. Consistency -  
	// 5 call with null - false

	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Employee))
			return false;
		
		Employee e = (Employee) obj;
		
		return this.name.equals(e.name) && Double.compare(this.salary, e.salary) == 0; 
	}


	
	
	
}
