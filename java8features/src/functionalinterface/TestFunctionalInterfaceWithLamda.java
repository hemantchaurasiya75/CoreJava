package functionalinterface;

import java.util.function.Predicate;

public class TestFunctionalInterfaceWithLamda {

	public static void main(String[] args) {
		Sayable ref = (name) -> System.out.println(name);
        ref.say("Hridesh");
        ref.hello("Morning");
        
       
	}
}
