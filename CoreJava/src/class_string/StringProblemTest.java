package class_string;

public class StringProblemTest {

	public static void main(String[] args) {
		String str = "aaafhemant";
		
		//System.out.println("Before "+str);
																
		while(str.startsWith("a")) {  						// 1	true   aafhemant
			System.out.println("in while");					// 2	true   afhemant
															// 3    true   fhemant
			str = str.replaceFirst("a", "");						// 4    false  fhemant
			
		}
		
		System.out.println("After "+str); // fhemant
	} 
}
