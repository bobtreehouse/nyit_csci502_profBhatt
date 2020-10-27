
public class MethodSamples {

	public static int addNumbers(int x, int y) {
		
		//x = 56;
		//y = 134;
		
		return x+y;

		// TODO Auto-generated constructor stub
		
		//int x, y;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("We are in the main method.");
		System.out.println("Now calling another method...");
		//int x, y;
		
		int x = 56;
		int y = 134;
		int sum = addNumbers(x,y);

	
		
		System.out.println("The method will add " + x + " and " + y + " and the sum is: " + sum);
		
		//System.out.println(sum);
	}

}
