package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Emp{
	private int id;
	private String name;
	private String designation;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public Emp(int id, String name, String designation) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", designation=" + designation + "]";
	}
	
}
public class CollectFromStream {
	
	public static void main(String[] args) {
		List<Emp> list = new ArrayList<>();
		Emp e1 = new Emp(1, "ab", "developer");
		Emp e2 = new Emp(2, "bc", "manager");
		Emp e3 = new Emp(3, "de", "lead");
		Emp e4 = new Emp(4, "fg", "developer");
		Emp e5 = new Emp(5, "hi", "developer");
		Emp e6 = new Emp(6, "jk", "manager");
		
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		list.add(e6);
		
		Map<Object, Long> map = list.stream().collect(Collectors.groupingBy(e -> e.getDesignation(), Collectors.counting()));
		
		map.entrySet().forEach(k -> {
			System.out.println(k);
		});
	}
}