package methodreference;

interface inter1{
	public abstract void method();
}

public class InstanceMethodReference {
	public void methodImp() {
		System.out.println("Method Impl called");
	}
	public static void main(String[] args) {
		inter1 i1 = new InstanceMethodReference()::methodImp;
		
		i1.method();
	}
}
