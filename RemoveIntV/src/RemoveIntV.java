import java.util.List; 
import java.util.ArrayList; 
import java.util.Iterator; 

public class RemoveIntV {
	
	public static int[] removeV(int[] in, int intv) {
		int count = 0;
		
		for(int number: in) {
			if(number == intv) {
				count++;
			}
		}
		
		if(count == 0) {
			return in;
		}
		int[] out = new int[in.length - count];
		int index=0;
		for(int value : in) {
			if (value != intv) {
				out[index] = value;
				index++;
			}
		}
		in = null;
		return out;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//write static method to remove in v from array ; 
		// assume v = 3 
	 
		int[] in = {0,1,3,2,3,0,3,1};
		System.out.println(removeV(in, 3));

	}

}
