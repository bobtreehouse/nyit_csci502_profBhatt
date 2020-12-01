
public class MethodOverload2 {

	// overloaded sum - this sum takes two int params:
	public int MethodOverload2(int x, int y) {
		return (x + y);
		
	}
	
	// overloaded sum - this sum takes three int params:
	public int MethodOverload2(int x, int y, int z) {
		return(x + y + z);
	}
	
	// overloaded sum - this sum takes two double parameters:
	public double MethodOverload2(double x, double y) {
		return (x + y);
	}
	
	// Driver code
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverload2 s = new MethodOverload2();
		System.out.println(s.MethodOverload2(10, 20));
		System.out.println(s.MethodOverload2(10,20,30));
		System.out.println(s.MethodOverload2(10.5,20.5));
	}

}
