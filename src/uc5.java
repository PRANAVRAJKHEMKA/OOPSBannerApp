public class uc5 {

    // Main method to run the banner display
    public static void main(String[] args) {

        // Define and populate String array inline
        // Each line represents O O P S
        String[] lines = {
                String.join(" ", " *** ",  " *** ",  " ****** ", " ***** "),
                String.join(" ", "**   **", "**   **", "**    **", "**     "),
                String.join(" ", "**   **", "**   **", "**    **", "**     "),
                String.join(" ", "**   **", "**   **", "******  ", " ***** "),
                String.join(" ", "**   **", "**   **", "**       ", "      **"),
                String.join(" ", "**   **", "**   **", "**       ", "      **"),
                String.join(" ", " *** ",  " *** ",  "**       ", " ***** ")
        };

        // Print using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}