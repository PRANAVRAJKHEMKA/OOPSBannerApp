public class q23 {
    public static void main(String[] args) {

        // Command-line arguments: m (month), d (day), y (year)
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        // Apply formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Output (0 = Sunday, 1 = Monday, ..., 6 = Saturday)
        System.out.println("Day index: " + d0);

        // Optional: print actual day
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        System.out.println("Day: " + days[d0]);
    }
}