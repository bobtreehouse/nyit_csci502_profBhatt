
import java.math.BigDecimal;


public class PayCalcBobT {
	public static void main(String [] args) {
		BigDecimal payRate = new BigDecimal(20);
		RegularPay regPay = new RegularPay(payRate);
		System.out.println(regPay.computePay(10));
		
		PayCalculator hazPay = new HazardPay(payRate);
		System.out.println(hazPay.computePay(10));
		
	}
}