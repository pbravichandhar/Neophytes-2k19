import java.util.regex.*;

class RegexTestStrings {
    public static final String EXAMPLE_TEST = "[][]=-  =;';[' ";
            // + "string whic5346583h I'm going to " + "use for patt][p];[;/[;'/;ern matching.";

    public static void main(String[] args) {
        System.out.println(EXAMPLE_TEST.matches("\\W.*"));
        String[] splitString = (EXAMPLE_TEST.split("\\s+"));
        System.out.println(splitString.length);
        for (String string : splitString) {
            System.out.println(string);
        }
        // replace all whitespace with tabs
        System.out.println(EXAMPLE_TEST.replaceAll("\\s+", "\t"));
    }
}
