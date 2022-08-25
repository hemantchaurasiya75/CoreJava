package class_string;

public class Employee {

	private int empId;
	private Address address;
	
	public Employee(int empId, Address address) {
		super();
		this.empId = empId;
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", address=" + address + "]";
	}
	
	
	
	
}
