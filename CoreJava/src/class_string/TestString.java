package class_string;

public class TestString {

	public static void main(String[] args) {
		
		//String sObj = new String("India");
		//String sObj2 = new String("India");
		//System.out.println(sObj.equals(sObj2));
		//System.out.println(s == sObj3);
		
//		String s = "India";
//		
//		String sObj3 = new String(s);
//		String sObj4 = new String(s);
//		
//		s = "I lv India";
//		
//		System.out.println(s.equals(sObj3));
//		System.out.println(sObj4.equals(sObj3));
		
		Address add = new Address("Gwl");
		
		Employee e1 = new Employee(1, add);
		
		System.out.println("Before Update Address....");
		System.out.println(e1);
		
		// update address
		add.setCity("Ind");
		
		System.out.println("After update Address....");
		System.out.println(e1);
		
		
		
		
		
		
		
	}
}
