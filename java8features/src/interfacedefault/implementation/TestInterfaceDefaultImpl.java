package interfacedefault.implementation;

public class TestInterfaceDefaultImpl {
	
	public static void main(String[] args) {
		Printer sm = new Samsung();
		Printer lg = new LG();
		
		sm.print();
		lg.print();
		
		sm.display();
		lg.display();
		
		sm.show();
		lg.show();
	}

}
