class NestTry{  
 public static void main(String args[]){  
  try{

    try{  
     int variable1 =39/0;  
    }
    catch(ArithmeticException e)
    {
      System.out.println(e);
    }  
   
    try
    {  
    int array1[]=new int[5];  
    array1[5]=4;  
    }
    catch(ArrayIndexOutOfBoundsException e)
    {
      System.out.println(e);
    }  
  }
  catch(Exception e)
  {
    System.out.println(e);
  }   
 }  
}  