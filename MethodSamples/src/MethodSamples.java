
public class MethodSamples {

	public static int addNumbers(int x, int y) {
		
		return x+y;

		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are in the main method.");
		System.out.println("Now calling another method...");
		int x, y;
		
		x = 56;
		y = 134;
		int sum = addNumbers(x,y);

		
		System.out.println("The method will add " + x + " and " + y + " and the sum is: " + sum);
		
	
	}

}
