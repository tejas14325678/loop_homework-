import java.util.Scanner;

public class ReverseNumber {

    public static void main(String[] args) {

        // variable declration
        int reversed, digit,i;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter number");


        int num = scanner.nextInt();

        // for loop means condition for the print the reverse number
        for(i=0; num>0; num=num/10)
        {
           digit = num%10; // modules of the number
           i =i * 10 + digit;

        }

        // print the reverse number
        System.out.println("reversed number:" + i);


    }
}
