import java.String.*;
import java.util.Scanner;

class Validate {
static boolean validateString(String str1, String str2)
{
int length1 = str1.length();
int length2 = str2.length();
if (length1 != length2)
return false;
int prev = -1, curr = -1;
int count = 0;
for (int i = 0; i < length1; i++) {
if (str1.charAt(i) != str2.charAt(i))
{
count++;
if (count > 2)
return false;
prev = curr;
curr = i;
}
}
return (count == 2 && str1.charAt(prev) == str2.charAt(curr) && str1.charAt(curr) == str2.charAt(prev));
}

public static void main(String args[]) {
    Scanner inp = new Scanner(System.in);
    String str1 = inp.nextLine();
    String str2 = inp.nextLine();
    if (validateString(str1, str2))
        System.out.print("True");
    else
        System.out.print("False");
}
}