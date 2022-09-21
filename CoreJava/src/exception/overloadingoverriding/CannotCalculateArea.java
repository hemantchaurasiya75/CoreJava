package exception.overloadingoverriding;

import java.util.Date;

public class CannotCalculateArea extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private Date date = new Date();

	@Override
	public String toString() {
		return "CannotCalculateArea [date=" + date + "]";
	}
	
	
}
