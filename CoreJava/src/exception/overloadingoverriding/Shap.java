package exception.overloadingoverriding;

public class Shap {

	int width;
	int height;
	
	public Shap(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int areaCalulate() throws CannotCalculateArea {
		if(this.width == 0 || this.height == 0)
			throw new CannotCalculateArea();
		
		return this.width * this.height;
	}
	
}