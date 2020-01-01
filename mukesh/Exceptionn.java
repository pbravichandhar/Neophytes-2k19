public class Exceptionn
{
	public static void main(String args[]){  
   try
   {  
      int a=50/0;
      
      /*String s=null;  
      System.out.println(s.length());
      
      String s1="abc";  
      int i=Integer.parseInt(s1); //Number Format Exception
      
      int a1[]=new int[5];  
      a1[10]=50;*/
   }
   catch(ArithmeticException e)
   {
       System.out.println(e);
   }  
  }  
}