import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner myScanner = new Scanner(System.in);
		String userName;
		
				
		// TODO Auto-generated method stub
		System.out.println("Hello please enter your name: ");
		userName = myScanner.nextLine();
		System.out.println("Nice to meet you " + userName);
		myScanner.close();
	}

}
