package class_string;

public class PassIntAsChar {

	private void print(char c) {
		System.out.println("char " + c);
	}
	
	private void print(int c) {
		System.out.println("int " + c);
	}
	
	public static void main(String[] args) {
		PassIntAsChar obj = new PassIntAsChar();
		
		//obj.print('a');
		obj.print(10);
		obj.print('a');
	}
}
