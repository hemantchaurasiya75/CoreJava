package method.equalshashcodecontract;

public class Phone {
	
	private String name;
	private int number;
	
	
	
	public Phone(String name, int number) {
		this.name = name;
		this.number = number;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}


	@Override
	public String toString() {
		return "Phone [name=" + name + ", number=" + number + "]";
	}


	@Override
	public int hashCode() {
		System.out.println("Phone hashcode called..");
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + number;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		System.out.println("Phone equal called..");
		if(!(obj instanceof Phone))
			return false;
		
		Phone p = (Phone) obj;
		
		return this.name.equals(p.name) && (Integer.compare(this.number, p.number) == 0);
	}
	
	
	

}
