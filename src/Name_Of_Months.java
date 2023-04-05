import java.util.Scanner;

public class Name_Of_Months {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the month number");
        int number = scanner.nextInt();

        // switch case use for the constant number and its print the month name by the using number of the month
        switch (number)
        {
            case 1:
                System.out.println("january");
                break;

            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
             // if the month number is not valid than its print the below message
            default:
                System.out.println("enter valid month number" + number);
        }

    }
}
