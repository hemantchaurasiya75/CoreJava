package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamOperation {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		list.add("ab");
		list.add("ab");
		list.add("bc");
		list.add("abc");
		list.add("");
		
		//boolean res = list.stream().anyMatch(s -> s.equals("ab"));
		//boolean res1 = list.stream().allMatch(s -> s.length() < 4);
		
		//System.out.println(list.stream().count());
		
		//List<String> li = list.stream().distinct().collect(Collectors.toList());
		//li.forEach(Systsem.out::println);
		
		
		list = list.stream().filter(s -> !s.isEmpty()).sorted().collect(Collectors.toList());
		
		list.forEach(System.out::println);
		
		Map<String, Long> countMap = list.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		for (Entry<String, Long> m: countMap.entrySet()) {
			System.out.println(m.getKey() +" "+m.getValue());
		}
	}
}
