package interfacedefault.implementation;

public interface Printer {
	
	void print();

	public default void display() {
		System.out.println("Printer display");
	}
	
	
	public default void show() {
		System.out.println("Printer show");
	}
}
