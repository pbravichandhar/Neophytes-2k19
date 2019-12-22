public class Sentence
{
    public static void main(String args[])
    {
        int l=x.length();
        String str=" "+Character.toUpperCase(x.charAt(0));
        for(int i=0;i<l-1;i++)
        {
            char c=x.charAt(i);char d=x.charAt(i+1);
            if(c==''&&d!='')
            {
                str=str+"."+Character.toUpperCase(x.charAt(i+1)); 
            }
        }
    }
}