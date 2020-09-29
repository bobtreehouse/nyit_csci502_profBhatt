
import java.util.Scanner;
import java.util.InputMismatchException;

public class Unary {
 
		public static void main(String[] args) {
			// TODO Auto-generated method stub
 
	        boolean error=false;
			int x=0;
			do
			{
				try
				{		
				Scanner myScanner = new Scanner(System.in);
	        	System.out.println("Please enter an intger and I will add 1 to it: ");
	        	x=myScanner.nextInt() + 1;
				error=false;
	        	 
				}  catch(InputMismatchException e)
				{
				// accept integer only.
				System.out.println("Please use a whole number only: ");
				error=true;
				}
			}
			while(error);
			System.out.println("The number you entered +1 is equal to: " + x );
		}
}

	        
 // validate user input is an integer.