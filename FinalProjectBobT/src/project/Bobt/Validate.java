package project.Bobt;

public class Validate {
	
	Validate(){ System.out.println( "Let me validate your selection...");}
	
		void validate_method() {
			 do {
		            System.out.println("Please enter a whole number between 1 and 1,000:");
		            System.out.println("\n");
		            userInput = myScanner.nextLine();
		            userMax = Integer.parseInt(userInput);
		        } while(userMax < 1 || userMax > 1000);
		}
	}

}
