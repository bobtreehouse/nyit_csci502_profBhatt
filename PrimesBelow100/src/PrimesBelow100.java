import java.util.ArrayList;

public class PrimesBelow100 {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//        /*
//        a prime number is a whole number (int) greater than 1, 
//        divisible only by  1 and itself.
//        */
//		// arrays require their size to be set at initialization 
//		// so let's use and ArrayList
//		ArrayList<Integer> primes = new ArrayList<>();
//
//		int N =2; 
//		 
//		//boolean isPrime;
//		
//		while(N<= 100){
//			
//			for (int i = 2; i <= 100; i++)
//				if( N % i == 0 ) {
//					boolean isPrime = false;
//					if(isPrime = true) {
//						primes.add(i);
//					}
//				}
//			
//				System.out.print(primes);
//			}
//			
//			
//		}
//				
//	}
    public static void main(String[] args) {

        //define limit
        int limit = 100;

        System.out.println("Prime numbers between 1 and " + limit);

        //loop through the numbers one by one
        for(int i=1; i < 100; i++){

                boolean isPrime = true;

                //check to see if the number is prime
                for(int j=2; j < i ; j++){

                        if(i % j == 0){
                                isPrime = false;
                                break;
                        }
                }
                // print the number
                if(isPrime)
                        System.out.print(i + " ");
        }
}
}