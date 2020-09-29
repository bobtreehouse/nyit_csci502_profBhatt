 
 
import java.util.Scanner;

public class SumOfTwo {

	public static void main(String[] args) {
		
		 
	 
		int firstNumber, secondNumber;
		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the application");
		
		System.out.println("Please enter your first number");
		firstNumber = input.nextInt();
		
		
		System.out.println("Thanks, you entered " +firstNumber);
		System.out.println("Now, pls enter your second number");
		secondNumber=input.nextInt();
		
		System.out.println("Thanks, you entered " +secondNumber);
		System.out.println("The sum of both of those numbers is");
		System.out.println(firstNumber+secondNumber);
 
	}

}
