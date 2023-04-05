import java.util.Scanner;

public class N_NaturalNumber {

    // main method

    public static void main(String[] args)
    {
        // variables define

        int i,n,sum=0;
        {
            // create scanner
            Scanner in = new Scanner(System.in);
            System.out.println("enter number");
            n=in.nextInt();

        }

        // print the n natural number
        System.out.println("N natural number is :"+n);

        // condition for the n number sum
        for (int j =1 ; j <= n; j++)
        {
            System.out.println(j);
            sum+=j;

        }
         // print the total number sum
        System.out.println("the sum of n number is : " +sum);
    }

}
