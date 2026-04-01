import java.util.Scanner;

public class q2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input in cm
        System.out.print("Enter base in cm: ");
        double base = sc.nextDouble();
        
        System.out.print("Enter height in cm: ");
        double height = sc.nextDouble();
        
        // Area in square centimeters
        double areaCm = 0.5 * base * height;
        
        // Convert cm to inches (1 inch = 2.54 cm)
        double baseInch = base / 2.54;
        double heightInch = height / 2.54;
        
        // Area in square inches
        double areaInch = 0.5 * baseInch * heightInch;
        
        // Output
        System.out.println("\nThe Area of the triangle in sq in is " 
                + areaInch + " and sq cm is " + areaCm);
        
        sc.close();
    }
}