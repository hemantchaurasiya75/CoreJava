package method.clone2;

import java.util.ArrayList;
import java.util.List;

public class TestEmpAddress {

	public static void main(String[] args) {
		
		List<String> skills = new ArrayList<String>();
		skills.add("C");
		skills.add("C++");
		
		Address ad = new Address("Gwl", 11111);

		System.out.println("creating e1..");
		EmployeeWithAddress e1 = new EmployeeWithAddress("Tom", skills, ad);
		System.out.println(e1);

		System.out.println("cloning...");
		EmployeeWithAddress cloned = (EmployeeWithAddress) e1.clone();
		System.out.println(cloned);
		
		System.out.println("Updating address of e1");
		
		Address e1Address = e1.getAddress();
		e1Address.setCity("Ind");
		e1Address.setPincode(22222);
		
		
		
		System.out.println("E1 = "+e1);
		System.out.println("Cloned "+cloned);
		
//		Address ad = new Address("Ind", 443311);
//		System.out.println("Original "+ ad);
//		
//		Address cloned = ad.clone();
//		System.out.println("Cloned "+cloned);
//		cloned.setCity("Ujj");
//		
//		System.out.println("After update.... ");
//		System.out.println("Original "+ ad);
//		System.out.println("cloned "+cloned);
	}
}
