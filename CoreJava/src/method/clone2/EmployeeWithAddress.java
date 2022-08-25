package method.clone2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWithAddress implements Cloneable {


	
	private String name;
	private List<String> skils;
	private Address address;
	
	
	
	
	public EmployeeWithAddress(String name, List<String> skils, Address address) {
		System.out.println("Arg constructor called..");
		this.name = name;
		this.skils = skils;
		this.address = address;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSkils() {
		return skils;
	}
	public void setSkils(List<String> skils) {
		this.skils = skils;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", skils=" + skils + " Address="+address+"]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((skils == null) ? 0 : skils.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EmployeeWithAddress other = (EmployeeWithAddress) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (skils == null) {
			if (other.skils != null)
				return false;
		} else if (!skils.equals(other.skils))
			return false;
		return true;
	}
	
	// Cannot reduce the visibility of the inherited method from Object
	
	@Override
	public EmployeeWithAddress clone() {
		EmployeeWithAddress emp;
		try {
			emp = (EmployeeWithAddress) super.clone();
			List<String> skills = emp.getSkils();
			List<String> cSkill = new ArrayList<String>();
			cSkill.addAll(skills);
			emp.setSkils(cSkill);
			
			Address add = emp.getAddress();
			
			Address newAdd = add.clone();
			
			emp.setAddress(newAdd);
			
			return emp;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
	}	

}
