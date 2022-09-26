package filtergroupby;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp {
	
	public int id;
	public String name;
	public String location;
	
	public Emp(int id, String name, String location) {
		this.id = id;
		this.name = name;
		this.location = location;
	}



	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", location=" + location + "]";
	}



	public static void main(String[] args) {
		List<Emp> empList = new ArrayList<>();
		
		Emp e1 = new Emp(1, "DD", "Delhi");
		Emp e2 = new Emp(1, "AA", "Pune");
		Emp e3 = new Emp(1, "BB", "Delhi");
		Emp e4 = new Emp(1, "CC", "Pune");
		
		empList.add(e1);
		empList.add(e2);
		empList.add(e3);
		empList.add(e4);
		
		Map<Boolean, List<Emp>> results= empList.stream().collect(Collectors.partitioningBy( n -> n.location.equals("Delhi")));
		results.forEach((k,v) ->{
			System.out.println(k);
			v.forEach(System.out::println);
		});
		
	}

}
