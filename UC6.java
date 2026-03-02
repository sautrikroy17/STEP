public class OOPSBannerApp {

    public static void main(String[] args) {

        String[] o = getO();
        String[] p = getP();
        String[] s = getS();

        String[] banner = new String[o.length];

        for (int i = 0; i < o.length; i++) {
            banner[i] = o[i] + "  " + p[i] + "  " + s[i];
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }

    // O Pattern
    public static String[] getO() {
        return new String[]{
                " *** ",
                "**  **",
                "**  **",
                "**  **",
                "**  **",
                "**  **",
                " *** "
        };
    }

    // P Pattern
    public static String[] getP() {
        return new String[]{
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**     ",
                "**     ",
                "**     "
        };
    }

    // S Pattern
    public static String[] getS() {
        return new String[]{
                " *****",
                "**     ",
                "**     ",
                " *****",
                "     **",
                "     **",
                " *****"
        };
    }
}
