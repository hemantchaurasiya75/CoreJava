package collection.overview;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	
	public static void main(String[] args) {
		
		
		Emp e = new Emp("Hemant");
		
		
		System.out.println(e);
		e.setName("Hridesh");
		
		System.out.println(e);
		
		
		
		int arr[] = new int[] {2,3};
		
//		int[] arr = new int[2];   // arr creation
//		arr[0] = 2;         		//  arr intilization
//		arr[1] = 3;
		
		int[] arr2 = new int[3];
		arr2[0] = arr[0];
		arr2[1] = arr[1];
		
		arr2[2] = 4;
		
		int b = 10;
		
		List<Integer> list = new ArrayList<>();
		
		
		list.add(1);
		
		list.add(b);  
		
		
		Integer i = b;  // Primitive -->> Wrapper is called boxing.
		
		int c = i;     // Wrapper -->> Primitive is called unboxing.
		
		// 
		
		
		
		
		
		
		Object[] arrList = {};
		Object[] arrList1 = new Object[0];
		
		
		System.out.println(Math.max(10, 1));
		
		System.out.println(10 >> 1);
		
		
		
	}
}
