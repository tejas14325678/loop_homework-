import java.util.Scanner;

public class Factorial_No {

    // main method
    public static void main(String[] args) {


        // define variable

        int i,factorial = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int num = scanner.nextInt(); // user can enter the number

        // find the factorial for the number which are enter by the users
        for ( i = 1; i <=num ; i++)

        {
            factorial = factorial *i;

        }

        // print the factorial number
        System.out.println("Factorial number is ...." + factorial);
    }
}
