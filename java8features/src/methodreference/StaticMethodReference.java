package methodreference;

@FunctionalInterface // optional, interface with only one abstract method is defaultly Functional
						// interface
interface inter {
	public abstract void method();
}

public class StaticMethodReference {
	
	public static void methodImp() {
		System.out.println("Method Impl called");
	}

	public static void main(String[] args) {
		inter i1 = StaticMethodReference::methodImp;

		i1.method();
	}
}
