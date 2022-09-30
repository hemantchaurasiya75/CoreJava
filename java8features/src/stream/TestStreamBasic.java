package stream;

import java.util.ArrayList;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collector;
import java.util.stream.Collectors;
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

		// filter - intermediate operation.
		// forEach - terminate
		// stream.filter(element -> element.contains("Apple")).forEach(element ->
		// System.out.println(element));

		// long count = stream.count();

		// Predicate<String> p = element -> element.contains("Apple");

//		stream.filter(p)
//				.map(element -> element.toUpperCase())
//				.forEach(System.out::println);

		// Map<String, length>
		// Map<String, Integer> map = stream.distinct().collect(Collectors.toMap(e -> e,
		// String::length));

		// System.out.println(map);

		// Total length of all element

		// IntSummaryStatistics intSummaryStatistics = stream.map(e ->
		// e.length()).collect(Collectors.summarizingInt(e -> e));

		// System.out.println(intSummaryStatistics);

		//Optional<Integer> sum = stream.map(e -> e.length()).reduce((total, element) -> total + element);

		//System.out.println(sum.get());
		
		//int sum = stream.map(e -> e.length()).collect(Collectors.summingInt(Integer::intValue));
		//System.out.println(sum);

		// Predicate
		// Consumer
		// Collector
		// Function

		// stream function returns stream, value
		// stream function can be categrize into two type
		// intermediate : which returns stream
		// trerminate : which trminate stream process.
		// stream.

		// stream.forEach((element) -> System.out.println(element));
		// Exception when try to use stream after call forEach
		// Exception in thread "main" java.lang.IllegalStateException: stream has
		// already been operated upon or closed

		// Stream<String> ds = stream.distinct();

		// ds.forEach((element) -> System.out.println(element));

		// long c = stream.count();

		// System.out.println(c);
		
		// stream.filter((e)-> {if(String::length>5)}).forEach((e)->sys(e))

		// stream.map(e -> e.concat(" fruit")).forEach(System.out::println);
		
		// stream.map(e -> e.length() > 5).forEach(System.out::println); // 
		
		// stream.filter(e -> e.length() > 5).forEach(System.out::println); //
		
		// map vs filter
		
	}
}
