package method.clone2;

import java.util.ArrayList;
import java.util.List;

 // POJO - 
// Cloneable - Marker interface
// Constructor don't call on clone()
public class Employee implements Cloneable {

	private String name;
	private List<String> skils;
	
	// 
	// private Address address;
	
	
	public Employee(String name, List<String> skils) {
		System.out.println("Arg constructor called..");
		this.name = name;
		this.skils = skils;
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
	
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", skils=" + skils + "]";
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
		Employee other = (Employee) obj;
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
	public Employee clone() {
		Employee emp;
		try {
			emp = (Employee) super.clone();
			List<String> skills = emp.getSkils();
			
			List<String> cSkill = new ArrayList<String>();
			
			cSkill.addAll(skills);
			
			emp.setSkils(cSkill);
			
			return emp;
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
		
		
	}
	
	
//	public static void main(String[] args) {
//		List<String> skills = new ArrayList<String>();
//		skills.add("C");
//		skills.add("C++");
//		
//		System.out.println("creating e1..");
//		Employee e1 = new Employee("Tom", skills);
//		
//		System.out.println(e1);
//		
//		
//		try {
//			System.out.println("cloning...");
//			Employee cloned =  (Employee) e1.clone();
//			System.out.println(cloned);
//			
//			
//			System.out.println("Reference checks " + (e1 == cloned));
//			System.out.println("equal = "+ e1.equals(cloned));
//			
//			cloned.getSkils().add("Java");
//			
//			System.out.println("After add new skill cloned = "+cloned);
//			
//			
//			System.out.println(e1);
//			
//			
//		} catch (CloneNotSupportedException e) {
//			System.err.println(e);
//		}
//		
//		
//	}
	
	
	
}
