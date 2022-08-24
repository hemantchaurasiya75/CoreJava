package method.clone2;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {
		List<String> skills = new ArrayList<String>();
		skills.add("C");
		skills.add("C++");

		System.out.println("creating e1..");
		Employee e1 = new Employee("Tom", skills);

		System.out.println(e1);

		System.out.println("cloning...");
		Employee cloned = (Employee) e1.clone();
		System.out.println(cloned);

		System.out.println("Reference checks " + (e1 == cloned));
		System.out.println("equal = " + e1.equals(cloned));

		cloned.getSkils().add("Java");

		System.out.println("After add new skill cloned = " + cloned);

		System.out.println(e1);
		

	}
}
