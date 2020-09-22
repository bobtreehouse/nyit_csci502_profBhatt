import java.util.Scanner;

public class RangeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner myScanner = new Scanner(System.in);
        String userInput;
        int userInt;

        do	
        {
            System.out.println("Please pick a number between 15 and 32: ");
            userInput = myScanner.nextLine();
            userInt = Integer.parseInt(userInput);

        } while (userInt <= 15 || userInt >= 32);
        System.out.println("Thank you for playing!");
        
	}

}
