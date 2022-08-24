package method.finilize;

public class FileOperation {

	private String ip;
	
	
	
	
	public FileOperation(String ip) {
		System.out.println("Constructor called..");
		this.ip = ip;
	}
	
	public void updateFile() {
		
	}
	
	@Override
	protected void finalize() {
		System.out.println("finalize called..");
		// used for closing all used resources in class
		try {
			super.finalize();
		} catch (Throwable e) {
			e.printStackTrace();
		}
	}
	
}
