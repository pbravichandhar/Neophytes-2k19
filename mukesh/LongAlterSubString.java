import java.util.*;
public class LongAlterSubString
{
    public static void LongAlterSubstr()
    {
        Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str1=sc.next();
		int len=str1.length();
		int []arr=new int[len];
		for(int index=0;index<len;index++)
		{
		    arr[index]=Integer.parseInt(str1.charAt(index)+"");
		}
		int[] refer=new int[len];
		refer[0]=1;
		for(int index1=1;index1<len;index1++)
		{
		    if((arr[index1]%2==0)&&(arr[index1-1]%2==1))
		    {
		        refer[index1]=1;
		    }
		    else if((arr[index1]%2==1)&&(arr[index1-1]%2==0))
		    {
		        refer[index1]=1;
		    }
		    else
		    {
		        refer[index1]=0;
		    }
		}
		String str="";
		String max="";
		for(int index2=0;index2<len;index2++)
		{
		    if(refer[index2]==1)
		    {
		        str=str+arr[index2];
		    }
		    else if(refer[index2]==0)
		    {
		        if(max.length()<str.length())
		        {
		            max=str;
		        }
		        str="";
		    }
		}
		System.out.println(max);
    }
	public static void main(String[] args) {
	    LongAlterSubstr();

		
		
		}
}