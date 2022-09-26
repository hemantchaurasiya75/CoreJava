package stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OccurrenceInList {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,3,1,4,6,4,7,8,4,5,3);
		
		list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting())).forEach((k,v) -> System.out.println(k+" "+v));
	
	
		
	}

}
