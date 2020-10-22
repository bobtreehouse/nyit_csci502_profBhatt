import java.util.Arrays;
public class TwoBoxesCandy {

	/*
	 * lets add 2 arrays together to get # of each candy type
	 * 1 mints, 2 chocolate with nuts, 3 chewy chocolates, 
	 * 4 dark chocolates and 5 sugar free suckers
	 * 
	 * */
	// let's use a Named Constant when defining the array 
	public static final int NUMBER_OF_CANDIES = 5;
	
	int[] order1 = {0,0,3,4,7};
	int[] order2 = {0,4,0,1,2};
//	static int[] combinedCandy = new int[NUMBER_OF_CANDIES];
// 
//	
//	public int[] combinedCandy(int[] totalCandy ) {
//		for (int i = 0; i < order1.length; ++i) {
//			combinedCandy[i] = order1[i] + order2[i];
//		}
	public static int[] c = new int[NUMBER_OF_CANDIES];
	int[] combinedCandy(int[] c ) {
	for (int i = 0; i < order1.length; ++i) {
	    c[i] = order1[i] + order2[i];
	}
		 return c;
		
}
	
	
	public static void main(String[] args) {
	 
		// TODO Auto-generated method stub
		
		
		System.out.println(Arrays.toString(c));
		
		
		
		

	}

}
