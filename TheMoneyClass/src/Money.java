import java.util.Scanner;

public class Money {
	private long dollars;
	private long cents;
	
	public void set(long newDollars) {
		if (newDollars < 0) {
			System.out.println("Error: Negative amounts of money are not allowed.");
			System.exit(0);
		}
		else {
			dollars = newDollars;
			cents=0;
		}
	}
	public void set(double newAmount) {
		if (newAmount < 0) {
			System.out.println("Error: Negative amounts of money are not allowed.");
			System.exit(0);
		}
		else {
			long allCents = Math.round(newAmount * 100);
			dollars = allCents / 100;
			cents = allCents % 100;
		}
	}
	public void set(Money moneyObject) {
		this.dollars = moneyObject.dollars;
		this.cents = moneyObject.cents;
	}
	public void set(String amountString) {
		String dollarsString;
		String centsString;
		//delete '$' if any:
		if (amountString.charAt(0) == '$')
			amountString = amountString.substring(1);
		amountString = amountString.trim();
		
		//Locate decimal point:
		int pointLocation = amountString.indexOf(".");
		
		if(pointLocation < 0 ) // If no decimal point
		{
			cents = 0;
			dollars = Long.parseLong(amountString);
		}
		else // string has decimal
		{
			dollarsString = 
					amountString.substring(0, pointLocation);
			centsString = 
					amountString.substring(pointLocation +1);
			
			if(centsString.length() <=1)
				centsString = centsString + "0";
			
			dollars = Long.parseLong(dollarsString);
			cents = Long.parseLong(centsString);
			if((dollars < 0) || (cents < 0) || (cents > 99)) {
				System.out.println("Error: Illegal representation of money.");
				System.exit(0);
			}
		}
	}
	public void readInput() {
		System.out.println("Enter amount on a line by itself: ");
		Scanner keyboard = new Scanner(System.in);
		String amount = keyboard.nextLine();
		set(amount.trim());
	}
	/* does not go to next line after displaying money*/

	public void writeOutput(){
		System.out.println("$" + dollars);
		if (cents <10)
			System.out.println(".0" + cents);
		else
			System.out.println("." + cents);
	}
	
	// returns n times the calling object
	public Money times(int n) {
		Money product = new Money();
		product.cents = n * cents;
		long carryDollars = product.cents / 100;
		product.cents = product.cents % 100;
		product.dollars = n * dollars + carryDollars;
		return product;
	}
	
	public Money addMoney(Money otherAmount) {
		Money sum = new Money();
		sum.cents = this.cents + otherAmount.cents;
		long carryDollars = sum.cents / 100;
		sum.cents  = sum.cents % 100;
		sum.dollars = this.dollars + otherAmount.dollars + carryDollars;
		return sum;
		
	}
	


}
