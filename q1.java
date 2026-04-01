import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter first number: ");
        float number1 = sc.nextFloat();
        
        System.out.print("Enter second number: ");
        float number2 = sc.nextFloat();
        
        // Performing operations
        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        
        // Handling division separately (to avoid divide by zero error)
        if (number2 != 0) {
            float division = number1 / number2;
            
            System.out.println("\nThe addition, subtraction, multiplication, and division value of 2 numbers "
                    + number1 + " and " + number2 + " is "
                    + addition + ", " + subtraction + ", "
                    + multiplication + ", and " + division);
        } else {
            System.out.println("\nDivision not possible (cannot divide by zero).");
            
            System.out.println("The addition, subtraction, and multiplication value of 2 numbers "
                    + number1 + " and " + number2 + " is "
                    + addition + ", " + subtraction + ", and "
                    + multiplication);
        }
        
        sc.close();
    }
}