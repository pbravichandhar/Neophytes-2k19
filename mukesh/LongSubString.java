import java.util.*;
public class LongSubString
{
    public static void check(String str1,String str2)
    {
        int len2=str2.length();
        String LongSubstr="";
        for(int index1=0;index1<len2;index1++)
        {
            String str="";
            for(int index2=index1;index2<len2;index2++)
            {
                str=str+str2.charAt(index2);
                if(str1.contains(str))
                {
                    if(LongSubstr.length()<str.length())
                    {
                        LongSubstr=str;
                    }
                }
                else
                {
                    break;
                }
            }
        }
        System.out.println(LongSubstr);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the First String");
		String str1=sc.next();
		System.out.println("Enter the Second String");
		String str2=sc.next();
		check(str1,str2);
		
		}
}