import java.util.*;
class primeno{
  public static void main(String args[]){
    int i,j,n1,n2;
    boolean flag=true;
    /*Scanner inp=new Scanner(System.in);
    System.out.println("Enter the limit :");*/
    n1=Integer.MIN_VALUE;
    n2=Integer.MAX_VALUE;
    System.out.println("the possible prime numbers\n:");
    for(i=n1;i<=n2;i++)
    {
      for(j=2;j<i;j++)
      {
       if(i%j==0)
        {
         flag=false;
         break;
        }
        else
        {
          flag=true;
        }
      }
      if(flag==true)
      {        
        System.out.println(i);
      }
    }
  }
}
