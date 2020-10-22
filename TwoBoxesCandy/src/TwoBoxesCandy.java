import java.util.Arrays;
public class TwoBoxesCandy {

	/*lets add 2 arrays together to get # of each candy type
	 * 1 mints, 2 chocolate with nuts, 3 chewy chocolates, 
	 * 4 dark chocolates and 5 sugar free suckers*/
	
	public static void main(String[] args) {
	 
		// TODO Auto-generated method stub
		
		//int NUMBER_OF_CANDIES = 5;
		int[] order1 = {0,0,3,4,7};
		int[] order2 = {0,4,0,1,2};
		int[] c = new int[5]; 
		
		for (int i = 0; i < order1.length; ++i) {
		    c[i] = order1[i] + order2[i];
		}
 
	
		System.out.println(Arrays.toString(c));
		
		

	}

}
