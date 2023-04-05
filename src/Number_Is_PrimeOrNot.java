import java.util.Scanner;

public class Number_Is_PrimeOrNot {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number to check if it is prime or not");
        int number = scanner.nextInt();

       // number is prime or not condition
        for (int i=2; i <= number /2; i++)
        {
            if ((number % i) ==0)
            {
                System.out.println("is prime number");
                break;
            }
            else
                System.out.println("number is not prime");
        }
        }


}
