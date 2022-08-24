package method.clone;

public class TestMain {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1 = new Employee("Hemant");
		Employee cloned = (Employee) e1.clone();
		
		System.out.println(e1 != cloned);
		System.out.println(e1.getClass() == cloned.getClass());
		System.out.println(e1.equals(cloned));
		
		
		
		System.out.println();
	}
	
	/**
	 * 1. If want to call clone() on object, whether calling clone method on class or super class.
	 * 	Class must implement Cloneable interface. Cloneable interface is marker interface that means doesn't have method. 
	 * 2. If class doesn't implements clone() then inherited clone() from Object class becomes private due to protected.
	 * 3. 
	 * 
	 * 
	 * */
}
