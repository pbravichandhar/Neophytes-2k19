import java.util.*; 
import java.io.*;

class Main {

  public static String LetterChanges(String str) {
     StringBuilder result = new StringBuilder();
        char[] strChars = str.toLowerCase().toCharArray();
        char[] replacements = {'b', 'c', 'd', 'E', 'f', 'g', 'h', 'I', 'j', 'k', 'l', 'm', 'n', 'O', 'p', 'q', 'r', 's', 't', 'U', 'v', 'w', 'x', 'y', 'z', 'A'};
        for (int i = 0; i < str.length(); i++) {
            result.append(strChars[i] >= 'a' && strChars[i] <= 'z' ? replacements[strChars[i] - 97] : strChars[i]);
        }
        return result.toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterChanges(s.nextLine())); 
  }

}