import java.util.*
class Zoo
{
    public satic void main(String[] args)
{
Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int count=0,flag=0;
    for(int i=0;i<str.length();i++)
    {
    if(str.charAt(i)=='z')
    {
        //System.out.print("ruba\n");
    count++;
    }
    else
    {
        //System.out.print("sss\n");
    flag++;
    }
    }
    if((2*count)==flag)
    {
    System.out.print("Yes");
    }
    else
    System.out.print("No");
}
}
//end
