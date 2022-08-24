package method.equalshashcodecontract;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestMain {

	public static void main(String[] args) {
		Phone p1 = new Phone("Hemant", 111111);
		Phone p2 = new Phone("Vivek", 22222);
		Phone p3 = new Phone("Hemant", 111111);
		
		
		
		
		List<Phone> userSubmittedList = new ArrayList<>();
		
//		userSubmittedList.add(p1);
//		userSubmittedList.add(p2);
//		userSubmittedList.add(p3);
//		
//		List<Phone> dbPhoneList = new ArrayList<Phone>(); // loaded from db
//		
//		userSubmittedList.forEach(p -> {
//			if(!dbPhoneList.contains(p))
//				dbPhoneList.add(p);
//		});
//		
//		System.out.println(dbPhoneList);
		
		// dbPhoneList save in db
		
//		Set<Phone> dbPhoneSet = new HashSet<>();
//		System.out.println("p1.hashCode() ->> "+p1.hashCode());
//		System.out.println("p2.hashCode() ->> "+p2.hashCode());
//		System.out.println("p3.hashCode() ->> "+p3.hashCode());
//		System.out.println("Adding P1");
//		System.out.println(dbPhoneSet.add(p1));
//		System.out.println("Adding P2");
//		System.out.println(dbPhoneSet.add(p2));
//		System.out.println("Adding P3");
//		System.out.println(dbPhoneSet.add(p3));
//		
//		System.out.println(dbPhoneSet.add(p3));
//		
//		System.out.println(dbPhoneSet);
//		
		
		// hashCode & euqal contract
		/**
		 * in collection - 
		 * case 1: hashCode implemented, euqals not implemented
		 * 		call hashcode 
		 * 			if not same : eqaual method not called
		 * 			if same : euqal method called
		 * 
		 * case 2: hashCode not implement, euqals implemented
		 * 		call Object class hascode
		 * 		if not same: eqaual method not called, But Object class hashCode alywase differenct. 
		 * 					Only give same hash code when add same object repetely 
		 * 		if same : euqal method called
		 * 
		 * 
		 * IMPORTANT - When we implement euqals method then we must be implemetnt hashCode. 
		 * 				In case hash code not impliment equals doesn't call
		 * **/
		
		Map<Phone, String> map = new HashMap<Phone, String>();
		map.put(p1, p1.getName());
		map.put(p2, p2.getName());
		map.put(p3, p3.getName());
		
		System.out.println(map);
	}
}
