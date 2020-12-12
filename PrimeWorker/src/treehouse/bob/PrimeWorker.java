package treehouse.bob;

import java.util.Scanner;


public class PrimeWorker {
	
	public PrimeWorker( ) {
	}
 
	private String userInput;
	private int userInt;
	 	
	public String getUserInput() {
		return userInput;
	}

	public void setUserInput(String userInput) {
		this.userInput = userInput;
	}

	public  int getUserInt() {
		return userInt;
	}

	public void setUserInt(int userInt) {
		this.userInt = userInt;
	}

		void check_method() {
			
			Scanner myScanner = new Scanner(System.in);
			   
	    do {
	        System.out.printf("Please enter a number between 2 and 1000 and I will tell you the # of Primes "
	        		+ "\nin that range and also print out those prime numbers for you.\n>");
    
	        userInput = myScanner.nextLine();	        
	        //validate
	        if(userInput.isEmpty()) {
	        	System.out.println("Nothing was entered. Please try again.");
	        }else 
	      
	        //the scanner took in a String - we need to convert that to an Integer:
	        userInt = Integer.parseInt(userInput);
	        
	    	} while(userInt < 2 || userInt > 1000);
	    
	        /*
	        so with the above we keep going back the "do" during the
	        "while" is IN PLACE
	         */ 
	  System.out.println("\nYou selected: " + userInput);
	  System.out.println("\nLet me check your input...");
	 
	  //let's add a delay in the console output to simulate long computation or network latency
	  try
	  {
	      Thread.sleep(2000); //insert a pause in milliseconds
	  }
	  catch(InterruptedException ex)
	  {
	      Thread.currentThread().interrupt();
	  }
	  
	  System.out.println("\nOK, looks good..getting your result...");
		
		try
		  {
		      Thread.sleep(2000);
		  }
		  catch(InterruptedException ex)
		  {
		      Thread.currentThread().interrupt();
		  }
		
		PrintPrimes pr1 = new PrintPrimes(userInt);
		pr1.numberOfPrimes_method(); 
		
	    }
	
		

	}

