//Program to calculate the depth of the array
import java.util.Scanner;;
public class DepthOfArray
{
public static void depth(String str)
{
int depth = 0, max = 0;
for (int i = 0; i <str.length(); i++)
{
if (str.charAt(i) == '[')//check depth
{
depth++;
}
else if (str.charAt(i) == ']')
{
depth--;
}
if (depth > max)
{
max = depth;
}
}
System.out.println(max);
}

public static void main(String[] args) 
{
    Scanner sc = new Scanner(System.in);
    String str = sc.nextLine();
    depth(str);
}
}
//end
