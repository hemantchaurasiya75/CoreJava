package refelection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class TestModifyUsingReflection {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ClassNotFoundException, NoSuchFieldException, SecurityException {
		
		
		Class cal = Class.forName("refelection.LoanCalculator");
		Constructor[] cons = cal.getConstructors();
		LoanCalculator createdObject = (LoanCalculator) cons[0].newInstance(1000, 1);
		
		System.out.println(createdObject);
		
		Field field = cal.getDeclaredField("rate");
		field.setAccessible(true);
		
		field.setInt(createdObject, 20); // 200
		
		System.out.println(createdObject.getInterest());
	}
}
