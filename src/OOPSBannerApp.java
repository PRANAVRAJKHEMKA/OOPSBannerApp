public class OOPSBannerApp {

    // Method to print letter O
    public static void printO() {
        System.out.println(" ***** ");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println("*     *");
        System.out.println(" ***** ");
    }

    // Method to print letter P
    public static void printP() {
        System.out.println("*****  ");
        System.out.println("*    * ");
        System.out.println("*****  ");
        System.out.println("*      ");
        System.out.println("*      ");
    }

    // Method to print letter S
    public static void printS() {
        System.out.println(" ***** ");
        System.out.println("*      ");
        System.out.println(" ***** ");
        System.out.println("      *");
        System.out.println(" ***** ");
    }

    // Method to print full banner line-by-line
    public static void printBanner() {

        // Each row prints O O P S together
        System.out.println(" *****    *****    *****    ***** ");
        System.out.println("*     *  *     *  *    *  *      ");
        System.out.println("*     *  *     *  *****    ***** ");
        System.out.println("*     *  *     *  *            *");
        System.out.println(" *****    *****   *       ***** ");
    }

    public static void main(String[] args) {

        System.out.println("\n=== OOPS BANNER OUTPUT ===\n");

        // Print final ASCII banner
        printBanner();
    }
}