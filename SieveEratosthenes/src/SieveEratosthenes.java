/*
		 * computes largest prime less than a specified value using the Sieve of 
		 * Eratosthenes Algorithm ; rules out all multiples of lower primes 
		 * and anything remaining is a prime; prints out largest 
		 * */
		 
public class SieveEratosthenes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we will compute all primes less than the value specified on the command line or less that 100.
		int max = 1000; //assign default value 
		try { max = Integer.parseInt(args[0]);} //parse user-supplied arg
		catch(Exception e) {} //silently ignore exceptions 

		//create an array that specifies whether each number is prime or not 
		boolean[] isprime = new boolean[max+1];
		
		//assume all are primes until proven otherwise.
		for(int i = 0; i <= max; i++) isprime[i] = true;
		
		//however we know that 0 and 1 are not prime; make a note of it.
		isprime[0] = isprime[1] = false;
		
		//to compute all primes less than max we need to rule out,
		// multiples of all integers less than the square root of max.
		int n = (int) Math.ceil(Math.sqrt(max)); //see java.lang.Math class
		
		//now for each integer i from 0 to n:
		// of i is a prime, then none of its multiples are primes.
		
		for(int i = 0; i <= n; i++){
			if (isprime[i])
				for(int j = 2*i; j<= max; j = j + 1) // loop thru the multiples.
					isprime[j] = false; // they are not prime.
		}
		
		// now go look for the largest prime:
		int largest;
		for(largest = max; !isprime[largest]; largest--) ;
		// output the result 
		System.out.println("The largest prime less than or equal to " + max + " is " + largest );
	}

}
