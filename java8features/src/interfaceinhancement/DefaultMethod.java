package interfaceinhancement;

interface DefaultMeth {
	
	default String sayHi(){
		return "Hi";
	}
	default String sayHello(){
		return "Hello";
	}
}
class ImplClass implements DefaultMeth{
	
}
public class DefaultMethod{
	public static void main(String[] args) {
		ImplClass obj = new ImplClass();
		System.out.println(obj.sayHi());
		System.out.println(obj.sayHello());
	}
}
