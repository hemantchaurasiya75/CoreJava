package exception.overview;

import javax.management.RuntimeErrorException;

public class TestTryCatchFinallyMain {

	public static void main(String[] args) {
		
		
//		try {
//			System.out.println("try");
//			int i = 10/ 0;
//			System.out.println(i);
//		} catch (ArithmeticException e) {
//			System.out.println("catch ArithmeticException");
//		}catch (Exception e) {
//			System.out.println("catch Exception");
//		}finally {
//			System.out.println("finally");
//		}
		
//		try {
//			int i = 10 / 0;
//		} catch (ArithmeticException e) {
//			System.out.println(e.getLocalizedMessage());
//			System.out.println(e.getMessage());
//			System.out.println(e.toString());
//			e.printStackTrace();
//		}
//		
//		/ by zero
//		/ by zero
//		java.lang.ArithmeticException: / by zero
//		java.lang.ArithmeticException: / by zero
//			at exception.overview.TestTryCatchFinallyMain.main(TestTryCatchFinallyMain.java:21)
		
		try {
			throw new RuntimeException("thrown from try");
		} catch (RuntimeException e) {
			System.out.println("catch 1 "+ e.getMessage());
			throw new RuntimeException("thrown from catch 1");
		}
	}
}
