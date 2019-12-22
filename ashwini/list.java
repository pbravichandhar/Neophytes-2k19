import java.io.*;
class List
{
    public static void main(String[] args)throws IOException
    {
        BufferedReader obj=new BufferedReader(new InputStream(System.in));
        int pos=0;
        System.out.println("Enter the values of position to be searched");
        String x=obj.readLine();
        int v=Integer.parseInt(x);
        int a[]=new int[50];
        for(int i=0;i<5;i++)
        {
            System.out.println("Enter the no: ");
            String y=obj.readLine();
            a[i]=Integer.parseInt(y);
        }
        for(int i=0;i<5;i++)
        {
            if(v==a[i])
            pos=i+1;
        }
        System.out.println("position="+pos);
    }
}