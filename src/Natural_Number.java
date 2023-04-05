import java.util.Scanner;

public class Natural_Number {

    // main method
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        int num = scanner.nextInt();
        int sum = scanner.nextInt();

        // condition for the natural number
        for ( int i =1; i<= num; ++i)
        {
            // sum = sum+i
            sum += i;

        }

        // print the value of natural number
        System.out.println("Sum =" + sum);
    }
}
