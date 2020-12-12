package treehouse.bob;
import java.util.ArrayList;

public class PrintPrimes   {
 
	public PrintPrimes(int limit) {
		super();
		this.limit = limit;
	}

	private int limit;

	public int getLimit() {
		return limit;
	}

	public void setLimit(int limit) {
		this.limit = limit;
	}

	//when we compute Primes below we will place results in an array; 
	//however since we do not know the initial SIZE we have to use an ArrayList 
	void numberOfPrimes_method() {	
	
	ArrayList<Integer> values = new ArrayList<>();
	          
	        //loop through the numbers one by one
	        for(int i=2; i < limit; i++){

	                boolean isPrime = true;                              
	                //check to see if the number is prime
	                for(int j=2; j < i ; j++){

	                        if(i % j == 0){
	                                isPrime = false;
	                                break;
	                        }
	                }
	                //if each time we loop through 'i' = isPrime then add 'i' to the ArrayList 'values'.
	                if(isPrime) 
	                	values.add(i);          	
	                
	        }
	        //print out the ArrayList names 'values':

	        System.out.println("\nThe number of Primes between 1 and " + limit + " are: "); 
	        
	        System.out.println(values.size());
		
        	System.out.println("\nThe Prime numbers between 1 and " + limit + " are: "); 
        	System.out.println(values);

	}
}

