package interfacedefault.implementation;

public class Samsung implements Printer{

	@Override
	public void print() {
		System.out.println("I am samsung");
		
	}
	
	@Override
	public void display() {
		System.out.println("Samsung display");
	}

}
