
import java.math.BigDecimal;


public class HazardPay extends PayCalculator {

	public HazardPay(BigDecimal payRate) {
		super(payRate);
	}
	
	@Override
	public BigDecimal computePay(float hour) {
		// TODO Auto-generated method stub
		return payRate.multiply(new BigDecimal(hour)).multiply(new BigDecimal(1.5));
	}

}