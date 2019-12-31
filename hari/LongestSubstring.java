import java.util.Scanner;
class LongestSubstring
{
    public static void main(String []args)
    {
        int j=0,i=0,max=0,flag=0;
        Scanner s=new Scanner(System.in);
        String a=s.next();
        char[]arr=a.toCharArray();
        int[] checkarr=new int[a.length()];
        String []res = new String[a.length()];
        String ResSubstring = "";
        StringBuffer resultstring = new StringBuffer();
        for(char item:arr)
        {
            checkarr[i] =Integer.parseInt(item + "");
            i++;
        }
        i=1;
        for(;i<a.length();i++)
        {
            if((checkarr[i]%2==1 )&& (checkarr[i-1]%2==0))
            {

                if(flag!=0)
                {
                    resultstring.append(checkarr[i]);
                }
                else
                {
                    resultstring.append(checkarr[i-1]+""+checkarr[i]);
                }
                flag++;

            }
            else if((checkarr[i]%2==0) && (checkarr[i-1]%2==1))
            {
                if(flag!=0)
                {
                    resultstring.append(checkarr[i]);
                }
                else
                {
                    resultstring.append(checkarr[i-1]+""+checkarr[i]);
                }
                flag++;
            }
            else
            {
                flag=0;
                if(!(resultstring.toString().equals("")))
                {
                    res[j]= resultstring.toString();
                    resultstring.setLength(0);
                    j++;
                }
            }
        }

        for(String item:res)
        {
            try
            {
                if(max<item.length())
                {
                    max=item.length();
                    ResSubstring=item;
                }
            }
            catch (NullPointerException e)
            {
                break;
            }
        }
        System.out.print(ResSubstring);
    }
}