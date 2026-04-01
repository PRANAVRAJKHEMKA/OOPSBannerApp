import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        // Taking input in feet
        System.out.print("Enter distance in feet: ");
        double distanceInFeet = sc.nextDouble();
        
        // Convert feet to yards (1 yard = 3 feet)
        double yards = distanceInFeet / 3;
        
        // Convert feet to miles 
        // 1 mile = 1760 yards and 1 yard = 3 feet
        // So, 1 mile = 1760 * 3 = 5280 feet
        double miles = distanceInFeet / 5280;
        
        // Output
        System.out.println("The distance in yards is " + yards 
                + " while the distance in miles is " + miles);
        
        sc.close();
    }
}