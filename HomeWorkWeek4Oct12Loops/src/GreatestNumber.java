import java.util.Scanner;

public class GreatestNumber {
	
    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        System.out.print("Enter 1st number: ");
        int num1 = reader.nextInt();
        System.out.print("Enter 2nd number: ");
        int num2 = reader.nextInt();
        System.out.print("Enter 3rd number: ");
        int num3 = reader.nextInt();
        
        if(num1 >= num2 && num1 >= num3) {
        	System.out.println("The 1st number (" + num1 + ") is the largest number.");

    }	else if(num2 >= num1 && num2 >= num3) {
    	System.out.println("The 2nd number (" + num2 + ") is the largest number.");
    	
    }	else {
    	System.out.println("The 3nd number (" + num3 + ") is the largest number.");
    }

}


}
