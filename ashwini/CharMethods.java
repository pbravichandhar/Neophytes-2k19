import java.lang.*;
public class CharMethods
{
     public static void main(String[] args)
    {
        System.out.println(Character.digit('6','5')); //assign numeric value
        System.out.println(Character.isLetter('A'));   
        System.out.println(Character.isLetter('0'));
        System.out.println(Character.isDigit('D'));   //value is digit or not
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetterOrDigit('z')); 
        System.out.println(Character.isLetterOrDigit('/'));
        System.out.println(Character.isWhitespace('\n'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isUpperCase('C'));
        System.out.println(Character.isUpperCase(64));
        System.out.println(Character.isLowerCase('c'));
        System.out.println(Character.isLowerCase(64));
        System.out.println(Character.toUpperCase('a'));
        System.out.println(Character.toUpperCase(122));
        System.out.println(Character.toLowerCase('C'));
        System.out.println(Character.toLowerCase(90));
        System.out.println(Character.toString('D'));
        System.out.println(Character.toString('f'));
        System.out.println(Character.charCount(0*9000)); // method determines whether a code point needs to be converted to one or two chars.
        System.out.println(Character.isSpaceChar('\u2028'));
        System.out.println(Character.isSpaceChar('\u2025'));
        System.out.println(Character.isMirrored(0x013c));//character is mirrored or not...'[',....']'
        System.out.println(Character.isMirrored(0x0c05));
        System.out.println(Character.isSupplementaryCodePoint(0x10ffd));
        System.out.println(Character.isSupplementaryCodePoint(0x004ca));
        System.out.println(Character.isTitleCase('Z'));
        System.out.println(Character.isTitleCase('\u01f2'));
        System.out.println(Character.isUnicodeIdentifierPart('-'));
        System.out.println(Character.isUnicodeIdentifierPart('g'));
        System.out.println(Character.isValidCodePoint(0x0125)); //method to make sure that the code point is valid.
        System.out.println(Character.isValidCodePoint(0x123fff));
        System.out.println(Character.reverseBytes('\u4d00'));      // char whose byte order is to be reversed ..?
        System.out.println(Character.isIdentifierIgnorable('\u0000'));//char is ignorable in unicode 
        System.out.println(Character.isIdentifierIgnorable('9'));
        System.out.println(Character.isHighSurrogate('\u0a4f'));//encoding Unicode characters with high code-points in the UTF-16 encoding scheme.(0x10000 to 0x10FFFF)
        System.out.println(Character.isJavaIdentifierPart(0x01f2));//determines whether a code point can start an identifier according to the Java Language Specification.
        System.out.println(Character.isLowSurrogate('\udc25'));//the product of 1,024 and 1,024)1,048,576 (0x100000) values between 65,536 (0x10000) and 1,114,111 (0x10FFFF) .
        System.out.println(Character.getDirectionality(0x2424));//specifies the char for which the directionality property is requested.    
    }
}