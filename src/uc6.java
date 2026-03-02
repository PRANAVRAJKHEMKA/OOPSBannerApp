public class uc6 {

    // Method to generate the pattern for the letter 'O'
    public static String[] getOPattern() {
        return new String[] {
                " *** ",
                "** **",
                "** **",
                "** **",
                "** **",
                "** **",
                " *** "
        };
    }

    // Method to generate the pattern for the letter 'P'
    public static String[] getPPattern() {
        return new String[] {
                "*****",
                "**  **",
                "**  **",
                "*****",
                "**",
                "**",
                "**"
        };
    }

    // Method to generate the pattern for the letter 'S'
    public static String[] getSPattern() {
        return new String[] {
                " *****",
                "**",
                "**",
                " *****",
                "     **",
                "     **",
                " *****"
        };
    }

    // Main method to run the banner display
    public static void main(String[] args) {

        // Get patterns using methods
        String[] oPattern1 = getOPattern();
        String[] oPattern2 = getOPattern();
        String[] pPattern  = getPPattern();
        String[] sPattern  = getSPattern();

        // Assemble and print banner line-by-line
        for (int i = 0; i < oPattern1.length; i++) {
            System.out.println(oPattern1[i] + "  "
                             + oPattern2[i] + "  "
                             + pPattern[i]  + "  "
                             + sPattern[i]);
        }
    }
}