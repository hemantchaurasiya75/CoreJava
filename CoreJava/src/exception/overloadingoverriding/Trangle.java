package exception.overloadingoverriding;


public class Trangle extends Shap{

	private int length;
	
	public Trangle(int width, int height, int lenght) {
		super(width, height);
		this.length = lenght;
		
	}

	// Super class method areaCalulate throwing CannotCalculateArea 
	// but child class method not compulsory to throw CannotCalculateArea exception
	// Child class can throw super class exception
	
	// in case of over load and override exception declaration with throws not considered.
	
	
	// return type consider in override case
	// return type not consider in over load case
	@Override
	public int areaCalulate() {
		
		return (this.width * this.height * this.length) / 2;
	}
	
	
	public long areaCalulate(int a) throws Exception {
		
		return (this.width * this.height * this.length) / 2;
	}
	
}
