package optional;

import java.util.Optional;

public class CalculationUtil {
	
	public static Integer sqareArea(int length) {
		if(length == 0)
			return null;
		
		return length * length;
	}
	
	public static Optional<Integer> rectuangularArea(int length, int width) {
		if(length == 0 || width == 0)
			return null;
		
		return Optional.of(length * width);
	}

}
