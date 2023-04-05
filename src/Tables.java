import java.util.Scanner;

public class Tables {
    // main method
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number for get the table of this number 1-12");
        int num = scanner.nextInt();

        // condition for the tables
        for (int i = 1; i <=12 ; i++)
        {
            // print the tables by using the numbers
            System.out.println(num+ " x " + i+ " = " +(i*num) );


        }
    }
}
