package refelection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestRefelection {
	
	public static void main(String[] args) {
		LoanCalculator cal = new LoanCalculator(1000, 1);
		
		System.out.println(cal.getInterest()); // 100
		
		 // Class cls = cal.getClass();
		
//		try {
//			Class cal = Class.forName("refelection.LoanCalculator");
//			
//			Method[] methods =  cal.getDeclaredMethods();
//			
//			for (int i = 0; i < methods.length; i++) {
//				System.out.println(methods[i]);
//			}
//			
//			LoanCalculator createdObject = null;
//			Constructor[] cons = cal.getConstructors();
//			for (int i = 0; i < cons.length; i++) {
//				try {
//					System.out.println(cons[i].newInstance(1000, 1));
//					createdObject = (LoanCalculator) cons[i].newInstance(1000, 1);
//				} catch (InstantiationException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IllegalAccessException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (IllegalArgumentException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				} catch (InvocationTargetException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			
//			System.out.println("createdObject -->>> "+createdObject);
//			
//			try {
//				Field field = cal.getDeclaredField("rate");
//				System.out.println(field);
//				
//				field.setAccessible(true);
//				
//				try {
//					field.setInt(createdObject, 20);
//				} catch (IllegalArgumentException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				} catch (IllegalAccessException e1) {
//					// TODO Auto-generated catch block
//					e1.printStackTrace();
//				}
//
//				cal.getConstructors();
//				
//			} catch (NoSuchFieldException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			} catch (SecurityException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//			
//			
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
		
		
		
		
	}

}
