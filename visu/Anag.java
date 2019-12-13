import java.util.*;

class Anag{

static int iteration(String a)
{
    int count=0,i,j;
    char[] a1=new char[20];
    a1=a.toCharArray();
    for(i=0;i<a.length()-1;i++)
    {
        for(j=i+1;j<a.length();j++)
        {

            if(a1[i]==a1[j])
            {
               count++;
            }
        }
    }
    System.out.println(count);
    return count;

}
public static void main(String[] args)
{
    Scanner s=new Scanner(System.in);

String s1= s.nextLine();
String s2=s.nextLine();
char[] a= new char[40];
char[] b= new char[40];
a=s1.toCharArray();
b=s2.toCharArray();

int l1,l2,i,j,count=0;
l1=s1.length();
l2=s2.length();
for(i=0;i<l1;i++)
{
    for(j=0;j<l2;j++)
    {
        if(a[i]==b[j])
        {
            b[j]=' ';
            count++;
        }
    }
}
int m=iteration(s1);
int n=iteration(s2);

System.out.println(l1+l2-(count+m+n));
}
}