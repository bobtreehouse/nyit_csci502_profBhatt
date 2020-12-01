 

	// Create a Main class
	public class FinalSample {
	  final int i;  // Create a class attribute
	  final static int x = 6;
	  
	  // Create a constructor in order to get the 'final i' which is NOT assigned to give it a value;
	  public FinalSample() {
	    i = 5;  // Set the initial value for the class attribute x
	  }

//	  public int adder(int x, int FinalSample) {
//		  
//		  return (x + FinalSample);
//	  }
	  public static void main(String[] args) {
		FinalSample myObj = new FinalSample(); // Create an object of class Main (This will call the constructor)
	    System.out.println(myObj.i+x); // Print the value of x + i
	  }
	}