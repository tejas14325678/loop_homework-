public class Number_Is_Divided_By_3And5 {

    // main method
    public static void main(String[] args) {

        System.out.println("number is divided by 3");

        // condition for the number is divided by 3
        for (int i = 1; i <100 ; i++)
        {
            // number is divided by 3
            if (i%3==0)
            System.out.println(i + ", ");
        }

        // print the number is divided by 5
        System.out.println("number is divided by 5");

        // condition for number is divided by 5
        for (int i =1; i<100; i++)

        {
            // number is divided by 5
            if (i%5==0)
                System.out.println(i+", ");
        }
    }
}
