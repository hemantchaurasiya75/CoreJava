package optional;

import java.util.Optional;

public class TestCalculationWithOptional {

	public static void main(String[] args) {
//		Integer res = CalculationUtil.sqareArea(0);
//		
//		if(res != null)
//			System.out.println(res.intValue());
		
		
//		Optional<Integer> res = Optional.ofNullable(CalculationUtil.sqareArea(10));
//		
//		if(res.isPresent())
//			System.out.println(res.get());
		
		
		Optional<Integer> res = CalculationUtil.rectuangularArea(0, 5);
		
		if(res.isPresent())
			System.out.println(res.get());
		
		
		
	}
}
