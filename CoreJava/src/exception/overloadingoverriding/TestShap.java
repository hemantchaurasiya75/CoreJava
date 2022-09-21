package exception.overloadingoverriding;

public class TestShap {

	public static void main(String[] args) {
		Shap s = new Trangle(10, 20, 30);
		
		System.out.println(s.areaCalulate());
	}
}
