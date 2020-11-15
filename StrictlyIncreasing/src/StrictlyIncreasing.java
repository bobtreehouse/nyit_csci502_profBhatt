import java.util.Arrays;

public class StrictlyIncreasing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] lineup = {3,4,5,6,7,8};
		boolean result1 = isStrictlyIncreasing(lineup); 
		
		if (isStrictlyIncreasing(lineup) != false) {
			
            System.out.println("The result of the method is " + result1 + "." + "\nThe array elements " + (Arrays.toString(lineup)) + " are in increasing order.");
		}else {
			
            System.out.println("The result of the method is " + result1 + "." + "\nThe array elements " + (Arrays.toString(lineup)) + " are NOT in increasing order.");		
		}
	 
	}
	


	
	public static boolean isStrictlyIncreasing(double[] in) {
		boolean result = true;
		 
		for(int i=0; i<(in.length -1); i++) {
			if(in[i+1]<=in[i])
				result = false;
		}
		return result;
		
			
	}
	
}

		



