import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        // Calculating quotient and remainder
        int quotient = number1 / number2;
        int remainder = number1 % number2;

        // Printing output in required format
        System.out.println("The Quotient is " + quotient + 
                           " and Remainder is " + remainder + 
                           " of two number " + number1 + 
                           " and " + number2);

        sc.close();
    }
}