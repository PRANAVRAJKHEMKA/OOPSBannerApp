import java.util.Scanner;

public class q18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Step 2: Initialize count
        int count = 0;

        // Handle case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Step 3: Loop until number becomes 0
            while (number != 0) {
                number = number / 10; // remove last digit
                count++;              // increase count
            }
        }

        // Step 4: Display result
        System.out.println("Number of digits: " + count);
    }
}