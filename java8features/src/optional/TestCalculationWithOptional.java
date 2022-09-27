package optional;

import java.util.Optional;

public class TestCalculationWithOptional {

	public static void main(String[] args) throws Exception {
//		Integer res = CalculationUtil.sqareArea(0);
//		
//		if(res != null)
//			System.out.println(res.intValue());
		
		
//		Optional<Integer> res = Optional.ofNullable(CalculationUtil.sqareArea(10));
//		
//		if(res.isPresent())
//			System.out.println(res.get());
		
		
		Optional<Integer> res = CalculationUtil.rectuangularArea(10, 5);
		
//		if(res.isPresent())
//			System.out.println(res.get());
		
		//Integer i = res.orElse(0);
		//Integer i = res.orElseGet(() -> 10);
		//Integer i = res.orElseThrow(() -> new Exception("value is 0"));
		
		//System.out.println(i);
		
		
		
	}
}
