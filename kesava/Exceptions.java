import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Exceptions  {

    static Exception Error(Exception e)
        {
          System.out.println(e);
          System.exit(1);
          return e;
        } 
       
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
        int []a=new int[5];
        for(int i=0;i<5;i++)
        { try
           {
            a[i]=s.nextInt();
           }
           catch(Exception e)
           {
               Error(e);
               break;
           }
        }
        try
        {
            try
            {
                for(int i=0;i<5;i++)
                {
                    for(int j=0;j<5;j++)
                    {
                        if(a[j]!=0)
                        {
                            System.out.println(a[i]/a[j]);
                        }
                        else
                            {
                                throw new Exception("Number cannot be divided by zero");
                            }
                    }
                }
            }

            catch (Exception e)
            {

                System.out.println(e);
            }
            System.out.println(a[a.length+1]);
        }
       catch (ArrayIndexOutOfBoundsException e)
       {
           System.out.println(e);
       }
        finally
        {
           System.out.println("Finally block");
        }

        try {

            FileReader fr=new FileReader("/home/coderover/IdeaProjects/sample/sample.txt");
            FileInputStream fileInputStream=new FileInputStream("/home/coderover/IdeaProjects/sample/sample.txt");
        }
        catch (FileNotFoundException e) {
            System.out.println(e);
        }


    }
}
