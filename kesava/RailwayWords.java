import java.util.Scanner;
public class RailwayWords {
    private static void check(String []arr)
    {
      int count=0;
      for(String a:arr)
      {
          for (int i = 0; i < arr.length; i++)
          {
             if(arr[i].equals(a))
             {
                 count+=1;
                 if(count>1)
                 {
                     System.out.println("\nThere are some repeating words");
                     System.exit(0);
                 }
             }
          }
          count=0;
      }
    }
    public static void main(String []args)
    {
       Scanner s=new Scanner(System.in);
       try {

           int size, flag = 0;
           char prev;
           size = s.nextInt();
           if(size<0)
           {
               System.out.println("Enter a Valid Positive Integer");
               System.exit(0);
           }
           String[] arr = new String[size];
           for (int i = 0; i < size; i++) {
               arr[i] = s.next().toLowerCase();
           }
           check(arr);
           for (int i = 0; i < size; i++) {
               prev = arr[i].charAt(arr[i].length() - 1);
               if (i != (size - 1)) {
                   if (prev == arr[i + 1].charAt(0)) {
                       continue;
                   } else {
                       flag += 1;
                       break;
                   }
               }
           }
           if (flag == 0) {
               System.out.println("Valid");
           } else {
               System.out.println("Invalid");
           }
       }catch(Exception err)
       {
           System.out.println(err);
       }
    }
}
