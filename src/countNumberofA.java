import java.util.Scanner;

public class countNumberofA {

    // main method
    public static void main(String[] args) {

        // define varibles

        char cha = 'a';
        int count =0;

        // create scanner class
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter the string");

        // object created
        String string = scanner.nextLine();

        System.out.println(string);

        // condition for the loop

        for (int i = 0; i <string.length() ; i++)
        {
            // we are using the if condition
            if (string.charAt(i)==cha)
                count++;

        }

        System.out.println("total number of a is....." + count);
    }
}
