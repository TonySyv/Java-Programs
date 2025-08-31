public class ReplaceChar {

    // Function to replace characters in a string
    public static String replaceChar(String S, char c1, char c2) {
        StringBuilder result = new StringBuilder();

        for (char c : S.toCharArray()) {
            if (c == c1) {
                result.append(c2);
            } else if (c == c2) {
                result.append(c1);
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String S = "Omkhaz";
        char c1 = 'z', c2 = 'r';

        // Replace characters in string
        S = replaceChar(S, c1, c2);

        // Print modified string
        System.out.println("Modified string: " + S);
    }
}
