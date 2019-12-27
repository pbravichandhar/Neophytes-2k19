import java.util.*;
import java.util.regex.*;
class Regex3P{
    public static void main(String[] args) {
        String email="aplk@gmail.com";
        String regex = ^[a-zA-Z0-9_!#$%&’*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$;
         
        Pattern pattern = Pattern.compile(regex);
         
            Matcher matcher = pattern.matcher(email);
            System.out.println(email +" : "+ matcher.matches());  
    }
}

