import java.util.Scanner;

public class q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create double variables
        double a, b, c;

        // Take input
        System.out.print("Enter value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        c = sc.nextDouble();

        // Perform double operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        // Print results
        System.out.println("The results of Double Operations are "
                + result1 + ", "
                + result2 + ", "
                + result3 + ", and "
                + result4);

        sc.close();
    }
}