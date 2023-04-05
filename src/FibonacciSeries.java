import java.util.Scanner;

public class FibonacciSeries {


    // create variables
    static int a=0, b=0,c=1;


    // calling main method
    public static void main(String[] args)
    {
        // print the give line
        System.out.println("enter any number");

        Scanner scanner = new Scanner(System.in);

        // user are able to enter the number
        a = scanner.nextInt();
        System.out.println(a);

        for (int i = 1; i <a ; ++i)
        {
            // print the b value
            System.out.println(b);

            // create the total variable for the sum of the numbers
            int total = b+c;
            b = c;
            // answer = total  its help for printing the fibonacci series
            c=total;

        }
    }
}
