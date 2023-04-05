import java.util.Scanner;

public class X_range_sum {

    public static void main(String[] args) {


        // define variable
        int sum=0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number between 1-20");

        // user can enter the number

        int x= scanner.nextInt();

        // condition is use for the sum of the two number
        if (x > 20)

        {
            System.out.println("Please Enter number between 1-20 only");

        } else
        {
            sum = 0;
            for (int i=1; i<=x; i++)
            {
                sum +=i;
            }

            System.out.println("the sum of the x number    ..." +x+ "is" + sum);
        }


    }
}
