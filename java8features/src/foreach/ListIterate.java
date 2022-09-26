package foreach;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListIterate {

	public static void show(Integer a) {
		System.out.println("show "+a);
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		Consumer<Integer> p = (Integer a) -> System.out.println(a);
		list.forEach(p);
		
		Consumer<Integer> c = ListIterate::show;
		list.forEach(c);
		
		
	}

}
