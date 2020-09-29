
public class UnaryOperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myVariable = 7;
		int inc = 1;
		System.out.println("My Variable is");
		System.out.println(myVariable); //7
		System.out.println(myVariable = myVariable+1); //8
		System.out.println(myVariable++); //8
		System.out.println(++myVariable); //10
		System.out.println(myVariable = myVariable + inc); //11
		System.out.println(myVariable +=1); //12
		System.out.println("Now my Variable is");
		System.out.println(myVariable); //12

		}}