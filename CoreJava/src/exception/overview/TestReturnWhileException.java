package exception.overview;

public class TestReturnWhileException {
	
	public int getValue() {
		try {
			System.out.println("try");
			return 10 / 0;
		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException");
			return 1;
		} finally {
			System.out.println("Finally");
			return 2;
		}
	}
	public static void main(String[] args) {
		int val = new TestReturnWhileException().getValue();
		
		System.out.println(val);
	} 

}
