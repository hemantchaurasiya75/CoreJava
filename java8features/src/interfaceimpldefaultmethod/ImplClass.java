package interfaceimpldefaultmethod;

public class ImplClass implements InterfaceA, InterfaceB{

	@Override
	public String sayHi() {
		return InterfaceA.super.sayHi();
	}

}
