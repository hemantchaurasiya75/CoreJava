package optional;

import java.util.*;

public class OptionalExample {
	public static void main(String[] args) {
		Optional<String> op = Optional.of("hridesh");
		
		System.out.println(op.isPresent());
	
		op.ifPresent(System.out::println);
	}
}