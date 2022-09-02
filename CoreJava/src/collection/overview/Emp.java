package collection.overview;

public class Emp {


	private String name;
	
	
	public Emp() {
		System.out.println("No arg Constructor");
	}
	
	public Emp(String name){
		System.out.println("Arg constructor "+this);
		this.name = name;
	}
	
	
	
	@Override
	public String toString() {
		return "Emp [name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		System.out.println("Setter "+this);
		this.name = name;
	}
	
	String s = "class level";
	
	public void print() {
		String s = "local";
		
		System.out.println(s);
	}

}
