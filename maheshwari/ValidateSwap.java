//Validate swap
import java.util.Scanner;
class Validateswap
{
static boolean Validate(String str1, String str2)
{
int len1 = str1.length();
int len2 = str2.length();
if (len1 != len2)
return false;
int prev = -1, curr = -1;
int count = 0;
for (int i=0; i<len1; i++)
{
if (str1.charAt(i) != str2.charAt(i))
{
count++;
if (count > 2)
return false;
prev = curr;
curr = i;
}
}

return (count == 2 &&
str1.charAt(prev) == str2.charAt(curr) &&
str1.charAt(curr) == str2.charAt(prev));
}
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
String str1 =s.nextLine();
int number_of_words=s.nextInt();
String[] words=new String[number_of_words];
for(int i=0;i<number_of_words;i++)
{
words[i] = s.next();
}
for(String word:words)
{
System.out.println(Validate(str1,word) ? "Yes" :"No");
}
}
}
//end
