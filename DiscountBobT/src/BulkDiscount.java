
public class BulkDiscount extends DiscountPolicy {

	private double percent;
	private int minimum;

	public BulkDiscount(int min, double per) {
		minimum = min;
		percent = per;
	}

	@Override
	public double computeDiscount(int count, double itemCost) {
		// TODO Auto-generated method stub

		double discount = 0.00;
		minimum = 1;
		percent = 20;

		if (count > minimum) {
			discount = count * itemCost * percent/100;
		}
		
		return discount;
	}

}
