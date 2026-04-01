import java.util.Scanner;

public class q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int temp = number;   // store original number
        int sum = 0;

        // Calculate sum of digits
        while (temp > 0) {
            int digit = temp % 10;  // get last digit
            sum += digit;           // add to sum
            temp = temp / 10;       // remove last digit
        }

        // Check Harshad condition
        if (number % sum == 0) {
            System.out.println("Harshad Number");
        } else {
            System.out.println("Not a Harshad Number");
        }

        sc.close();
    }
}