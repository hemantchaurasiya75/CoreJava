package serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class TestSerialization {

	public static void main(String[] args) {
		
		Employee e = new Employee("Hemant", "ABC", 1000);
		
		System.out.println(e);
		
		
		File file = new File("emp.txt");
		
		try {
			
			FileOutputStream fileOut = new FileOutputStream(file);
			
			ObjectOutputStream objOut = new ObjectOutputStream(fileOut);
			
			objOut.writeObject(e);
			
			objOut.close();
			fileOut.close();
			
			System.out.println(file.getAbsolutePath());
			
		} catch (IOException e2) {
			e2.printStackTrace();
		}
		
		
		
	}
}
