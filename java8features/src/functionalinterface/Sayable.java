package functionalinterface;

@FunctionalInterface
public interface Sayable {

	void say(String msg);
    
    public default void hello(String msg) {
    	System.out.println(msg);
    }
}
