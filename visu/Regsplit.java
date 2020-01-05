import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Regsplit {
    public static void main(String args[]) {
        String text = "visu2msd3";
        String delimiter = "\\d";// checks for Any digit
        Pattern pattern = Pattern.compile(delimiter, Pattern.CASE_INSENSITIVE);
        String[] result = pattern.split(text);// function to split the string based on given delimeter

        for (String temp : result)
            System.out.println(temp);
    }
}