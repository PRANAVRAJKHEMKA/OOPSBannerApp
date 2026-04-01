import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input
        System.out.print("Enter unit price (INR): ");
        double unitPrice = sc.nextDouble();
        
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        
        // Calculating total price
        double totalPrice = unitPrice * quantity;
        
        // Output
        System.out.println("The total purchase price is INR " 
                + totalPrice + " if the quantity " 
                + quantity + " and unit price is INR " 
                + unitPrice);
        
        sc.close();
    }
}