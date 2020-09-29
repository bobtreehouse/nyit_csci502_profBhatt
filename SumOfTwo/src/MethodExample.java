
public class MethodExample {
	
	public static void main(String[] args) {
		//multiplyNumbers();
		
		int result = subtractNumbers();
		System.out.println("The result is ");
		System.out.println(result);
		
		int one,two;
		one=5;
		two=6;
		int sum= addNumbers(one,two);
		System.out.println("sum of one and two is " +sum);//11
	
	}
	public static int addNumbers(int x, int y) {
		return x+y;
	}
	
	public static void multiplyNumbers() {
		int a,b;
		a=5;
		b=6;
		System.out.println(a*b);
	}
	
	public static int subtractNumbers() {
		int a=6;
		int b=4;
		int c=a-b;
		return c;
	}

}
