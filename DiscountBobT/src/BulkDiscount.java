
public class BulkDiscount extends DiscountPolicy{
	
	private double percent;
	private double minimum;
	
	public BulkDiscount(int min, double per) {
		int minimum = min;
		double percent = per;
	}
	@Override
	public double computeDiscount(int count, double itemCost) {
		// TODO Auto-generated method stub
		 
		
		double discount = 1; 
		
		if (count > minimum) {
			discount = percent;
		}
		return percent * itemCost;
	}


}
