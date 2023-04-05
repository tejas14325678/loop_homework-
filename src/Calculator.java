import java.util.Scanner;

public class Calculator {

    // main method

    public static void main(String[] args) {
        char operator;
        double num1, num2, result;

        // create scanner class
        Scanner input = new Scanner(System.in);

        // ask use to enter operator

        System.out.println("choose the operator : +,-,*,/");
        operator=input.next().charAt(0);

        // ask user to enter number

        System.out.println("enter first number");
        num1 = input.nextDouble();

        System.out.println("enter second number");
        num2= input.nextDouble();


        switch (operator)
        {
            //addition of the number
            case '+':
                result=num1+num2;
                System.out.println(num1+" + " + num2 + " = " + result);
                break;

             // subtraction of the number
            case '-':
                result=num1+num2;
                System.out.println(num1+" - " + num2 + " = " + result);
                break;

             // multiplication of the number

            case '*':
                result=num1+num2;
                System.out.println(num1+" * " + num2 + " = " + result);
                break;

             // division of the number

            case '/':
                result=num1+num2;
                System.out.println(num1+" / " + num2 + " = " + result);
                break;

            default:
                System.out.println("please enter the valid operator");
                break;
        }

    }
}
