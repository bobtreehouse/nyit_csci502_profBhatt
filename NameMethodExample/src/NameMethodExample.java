
public class NameMethodExample {

	
	public static String myFriend(String a) {
		
		// we are testing a simple method that takes 'String a' as a parameter 
		// and RETURNS a STRING (the 'String' before the method name 'myFriend' is the return type and 
		// and the '(String a)' after the 'myFriend' is what we require to be 'passed' to the method or 
		// what the method takes IN as a parameter.
		
		String part2 = " because he was part of a Method.";
		return a + " is a cool person" +part2;
		 
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		String friend = "Bob";
		String b = "Greg";
		
		String friend2=myFriend(b);
		
		// we will test the first sentence where everything happens from INSIDE the MAIN
		// then we will test stuff that the 'myFriend' Method can do when we pass a parameter to it.
		
		System.out.println("My friend's name is " + friend);
		System.out.println("My friend's name is " + friend2);
	}

}
