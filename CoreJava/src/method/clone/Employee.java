package method.clone;

public class Employee implements Cloneable {

	private String name;

	public Employee() {
		System.out.println("No arg constructor");
	}
	
	public Employee(String name) {
		System.out.println("Arg constructor");
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	
	
	/**
	 * If class doesn't implement clone method then default(from Object class become private clone method). Because
	 *  When a protected member is inherited across package it becomes private member of inherited class
	 *  Whereas
	 *  when a protected member is inherited within the same package it becomes default member of inherited class.
	 * */
//	public static void main(String[] args) throws CloneNotSupportedException {
//		Employee e = new Employee("Hemant");
//		Employee cloned = (Employee) e.clone();
//		System.out.println(e);
//		System.out.println(cloned);
//	}
	
	
}
