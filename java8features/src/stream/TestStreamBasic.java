package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TestStreamBasic {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		list.add("Apple");
		list.add("Orange");
		list.add("Mango");
		list.add("PineApple");
		list.add("Banana");
		
		list.add("PineApple");
		list.add("Banana");
		
		Stream<String> stream = list.stream();
		
		// Predicate 
		// Consumer
		// Collector
		// Function
		
		// stream function returns stream, value
		// stream function can be categrize into two type
		// intermediate : which returns stream
		// trerminate : which trminate stream process.
		//stream.
		
		
		//stream.forEach((element) -> System.out.println(element));
		// Exception when try to use stream after call forEach
		// Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
		
		// Stream<String> ds = stream.distinct();
		
		//ds.forEach((element) -> System.out.println(element));
		
		//long c = stream.count();
		
		//System.out.println(c);
		
		
	}
}
