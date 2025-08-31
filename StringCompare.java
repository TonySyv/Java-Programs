public class StringCompare {

    // Function to compare two strings
    public static void compareFunction(String s1, String s2) {
        int x = s1.compareTo(s2); // Java's built-in comparison

        if (x != 0) {
            System.out.println(s1 + " is not equal to " + s2);
            if (x > 0)
                System.out.println(s1 + " is greater than " + s2);
            else
                System.out.println(s2 + " is greater than " + s1);
        } else {
            System.out.println(s1 + " is equal to " + s2);
        }
    }

    public static void main(String[] args) {
        String s1 = "Geeks";
        String s2 = "forGeeks";
        compareFunction(s1, s2);

        String s3 = "Geeks";
        String s4 = "Geeks";
        compareFunction(s3, s4);
    }
}
