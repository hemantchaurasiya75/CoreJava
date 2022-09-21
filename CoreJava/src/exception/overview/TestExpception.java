package exception.overview;

import java.io.File;
import java.io.IOException;

public class TestExpception {

	/**
	 * Exception:
	 * 1. Checked Exception - Will be checked on compile time by compile for exception handled or not.
	 * 							But exception would be raised on runtime.
	 * 
	 * 2. Runtime - Will not be checked on compile time for exception handling. But exception would be raised on runtime.
	 * 
	 * */
	public static void main(String[] args) {
		
//		File file = new File("");
//		
//		try {
//			file.createNewFile();
//		} catch (IOException e1) {
//			
//		}
		

//		
//		try {
//			int i = 10 /0;
//		} catch (ArithmeticException e) {
//			// TODO: handle exception
//		}
		
//		File file = new File("D://temp");
//		try {
//			file.createNewFile();
//			// write on file
//			// save file on sftp
//			//    sft connect -> assume exception occure at SFTPCnnectionexception 
//			
//		} catch (IOException e) {
//			// D://filepath
//		} catch (SFTPCnnectionexception e) {
//			
//		}
		
//		try {
//			file.createNewFile();
//			// write on file
//			// save file on sftp
//			//    sft connect -> assume exception occure at SFTPCnnectionexception 
//			
//		} catch (IOException | SFTPCnnectionexception e) {
//			// D://filepath
//		}
		
//		try {
//			try {
//				
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		} catch (Exception e) {
//			try {
//				
//			} catch (Exception e1) {
//				// TODO: handle exception
//			}
//		}
		
		// Unreachable catch block for IOException. It is already handled by the catch block for Exception
		// When Super class exception handle by catch block already then another catch blow with sub class not possiables
//		try {
//			throw new IOException("thowing IO");
//		} catch (Exception e) {
//			// TODO: handle exception
//		} catch (IOException e) {
//			// TODO: handle exception
//		}
		
		
//		try {
//			
//		} finally {
//			
//		}
		
//		try {
//			
//		} finally {
//			try {
//				
//			} catch (Exception e) {
//				
//			}
//		}
		
		
	}
}
