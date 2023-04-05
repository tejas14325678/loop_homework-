import java.util.Scanner;

public class SeriesSum {

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scanner.nextInt();

        double sum = 0;

        for (int i = 1; i<=n; i++)
        {
            sum += 1.0 /i;


        }

        System.out.println("the sum of the series is...." + sum);
    }
}
