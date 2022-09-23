package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TestDeserilization {

	public static void main(String[] args) {
		File file = new File("emp.txt");
		
		// try with resource -- introduced in java 7 
		// close able resources open with try doesn't need to close manually
		try (
				FileInputStream fileInput = new FileInputStream(file);
				ObjectInputStream objInput = new ObjectInputStream(fileInput);
			) {
			
			
			try {
				Employee e = (Employee) objInput.readObject();
				System.out.println(e);
				
				
				
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
