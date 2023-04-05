import java.util.Scanner;

public class TenNumberRange {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        // user are able to enter the number
        System.out.println("enter one number");

        // user should enter the number
        int a = scanner.nextInt();


        System.out.println("enter second number");
        int b = scanner.nextInt();


        // if the i =a and i <=b than its increase the number by plus one and its print the range numbers which are enter by users

        for (int i = a; i <=b ; i++)

        {
            // this line print the output of the code
            System.out.println(i);
        }


    }
}
