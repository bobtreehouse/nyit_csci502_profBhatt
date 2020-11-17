
public class MoneyDemo {
	
	public static void main(String[] args) {
		Money start = new Money();
		Money goal = new Money();
		
		System.out.println("Enter your current savings: ");
		start.readInput();
		goal = start.times(2);
		System.out.println("If you double that you will have ");
		goal.writeOutput();
		
		System.out.println(", or better yet:");
		goal = start.addMoney(goal);	
		System.out.println("If you tripple that original amount, you will have:");
		goal.writeOutput();
		System.out.println(); // end the line b/c writeOutput does not end the line.
		System.out.println("Remeber: A penny saved");
		System.out.println("Is a penny earned.");
	}

}
