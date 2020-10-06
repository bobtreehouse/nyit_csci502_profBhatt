import java.util.Scanner;

public class PositiveOrNegative {

    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a num: ");
        int num = reader.nextInt();

        if(num > 0)
            System.out.println(num + " is positive");
        else if(num < 0)
        {
            System.out.println(num+" is a negative");
        }
        else
        {
            System.out.println(num+" is neither positive nor negative");
        }
    }
}

