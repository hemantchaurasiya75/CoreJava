package refelection;

public class LoanCalculator {

	private int rate = 10;
	
	private int principle;
	
	private int time;

	public LoanCalculator(int principle, int time) {
		super();
		this.principle = principle;
		this.time = time;
	}
	
	
	
	public int getInterest() {
		return (this.rate * this.principle * this.time) / 100 ;
	}
	
	
	
	
	
}
