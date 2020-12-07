
import java.math.BigDecimal;


public class RegularPay extends PayCalculator {

	public RegularPay(BigDecimal payRate) {
		super(payRate);
	}

	@Override
	public BigDecimal computePay(float hour) {
		// TODO Auto-generated method stub
		return (payRate.multiply(new BigDecimal(hour)));
	}


}