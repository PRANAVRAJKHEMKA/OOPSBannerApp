public class OOPSBannerApp {

    public static void main(String[] args) {

        // Each println represents ONE ROW of the banner
        // Parts of the row are joined using String.join(" ", ...)

        System.out.println(String.join(" ",
                " *** ",
                " ***** ",
                " ***** ",
                " ***** "
        ));

        System.out.println(String.join(" ",
                "**   **",
                "**   **",
                "**",
                "**"
        ));

        System.out.println(String.join(" ",
                "**   **",
                "**   **",
                "****",
                "****"
        ));

        System.out.println(String.join(" ",
                "**   **",
                "**   **",
                "**",
                "    **"
        ));

        System.out.println(String.join(" ",
                "**   **",
                "**   **",
                "**",
                "    **"
        ));

        System.out.println(String.join(" ",
                "**   **",
                "**   **",
                "**",
                "**   **"
        ));

        System.out.println(String.join(" ",
                " *** ",
                " ***** ",
                "**",
                " ***** "
        ));
    }
}
