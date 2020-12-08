
public class DiscountBobT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BulkDiscount obj1 = new BulkDiscount(2, 15.0);
		double actualDiscount = obj1.computeDiscount(2, 15.0);
		System.out.println("here is discount " + actualDiscount);
	}

}
