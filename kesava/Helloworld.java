import java.util.Scanner;

public class Helloworld {
    public static void main(String[]args)
    {
        String a;
        String []arr;
        int max=0;
        Scanner s=new Scanner(System.in);
        a=s.nextLine();
        arr=a.split("\\s");
        for(int i=0;i<arr.length;i++)
        {
          if(arr[i].length()>max)
          {
              max=arr[i].length();
          }
        }
        max+=4;
        int len=arr.length+2;
        for(int i=0;i<len;i++)
        {
            System.out.println();

            for(int j=0;j<max;j++)
            {
                if (i == 0)
                {
                     System.out.print('*');
                }
                if(i==len-1)
                {
                     System.out.print('*');
                }
                else
                {

                    if(i!=0 && i!=len-1)
                    {
                        if(j==0)
                        {
                            System.out.print('*'+" "+arr[i - 1]);
                        }
                        if(j==max-1)
                        {
                            int k=arr[i-1].length()+2;
                            int m=max-k;
                            for(int l=0;l<m-1;l++)
                            {
                                System.out.print(" ");
                            }
                            System.out.print("*");
                        }

                    }

                }

            }
        }
    }
}

