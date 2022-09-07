package collection.list;

import java.util.ArrayList;

public class UniqueList<E> {

	ArrayList<E> list = new ArrayList<>();
	
	public boolean add(E element) {
		
		if(list.contains(element))
			return false;
		
//		for(int i=0;i<list.size();i++) {
//			if(list.get(i)==element) {
//				return false;
//			}
//		}
		
		
		return list.add(element);
	}

	@Override
	public String toString() {
		return list.toString();
	}
	
	
}
