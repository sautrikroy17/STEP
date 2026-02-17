public class OOPSBanner {

    public static void main(String[] args) {

        String line1 = " OOO   OOO   PPPP   SSSS ";
        String line2 = "O   O O   O  P   P S     ";
        String line3 = "O   O O   O  PPPP   SSS   ";
        String line4 = "O   O O   O  P         S  ";
        String line5 = " OOO   OOO   P     SSSS   ";

        String banner = line1 + "\n"
                      + line2 + "\n"
                      + line3 + "\n"
                      + line4 + "\n"
                      + line5;

        System.out.println(banner);
    }
}