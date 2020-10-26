// nested if example 	
public class NestedIf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int age = 20;
		int weight =51;
		
		//applying condition on age & weight
		if(age>=18) {
			if(weight>50) {
				System.out.println("you are eligible to donate blood.");
			}
			else {
				System.out.println("Sorry you cannot donate.");
			}
		}
	}

}
