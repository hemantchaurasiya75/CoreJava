package method.finilize;

public class TestMain {

	public static void main(String[] args) {
		FileOperation op = new FileOperation("10.1.1.1");
		
		op.finalize();

		// finalize vs finally
		
		try {
			
		} finally {
			
		}
	}
}
