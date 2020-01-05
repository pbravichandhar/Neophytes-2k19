import java.util.*;
class Validation {
    public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
}

class UserNameValidation {
    public static void main(String args[]) {
        Scanner inp = new Scanner(System.in);
        String name = inp.next();
        // match the name with regex
        if (name.matches(Validation.regularExpression)) {
            System.out.println("Valid");
        } else {
            System.out.println("Invalid");
        }
    }
}
