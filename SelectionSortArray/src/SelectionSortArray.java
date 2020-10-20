import java.util.Arrays; 
public class SelectionSortArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		        // Our arr contains 8 elements 
		        int[] arr = {13, 7, 6, 45, 21, 9, 101, 102}; 
		  
		        
		        System.out.println("Original arr[] :" + (Arrays.toString(arr))); 
		        
		        Arrays.sort(arr); 
		        
		        System.out.printf("Modified arr[] : %s", 
		                          Arrays.toString(arr)); 
		    } 
	
}
