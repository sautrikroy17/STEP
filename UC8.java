import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Create and return character pattern map
    public static Map<Character, String[]> createPatternMap() {

        Map<Character, String[]> patternMap = new HashMap<>();

        patternMap.put('O', new String[]{
                " *** ",
                "**  **",
                "**  **",
                "**  **",
                "**  **",
                "**  **",
                " *** "
        });

        patternMap.put('P', new String[]{
                "***** ",
                "**  **",
                "**  **",
                "***** ",
                "**     ",
                "**     ",
                "**     "
        });

        patternMap.put('S', new String[]{
                " *****",
                "**     ",
                "**     ",
                " *****",
                "     **",
                "     **",
                " *****"
        });

        return patternMap;
    }

    // Render message using map
    public static void renderMessage(String message, Map<Character, String[]> patternMap) {

        int height = 7;

        for (int i = 0; i < height; i++) {

            for (int j = 0; j < message.length(); j++) {

                char ch = message.charAt(j);
                String[] pattern = patternMap.get(ch);

                if (pattern != null) {
                    System.out.print(pattern[i] + "  ");
                }
            }

            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {

        Map<Character, String[]> patternMap = createPatternMap();

        String message = "OOPS";

        renderMessage(message, patternMap);
    }
}
