import java.io.*;
import java.util.*;
class neon {
  public static void main(String args[]){
    int n,sq,r=0,sum=0;
    Scanner inp = new Scanner(System.in);
    System.out.println("enter n:");
    n=inp.nextInt();
    sq=n*n;
    while(sq>0){
    r=sq%10;sum=sum+r;sq=sq/10;
    }
    if(sum==n)
    {
      System.out.println(" neon number");
    }
    else
    {
      System.out.println(" not a neon number");
    }
  }
}