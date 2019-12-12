import java.io.*;
import java.util.*;
// program for printing yes if the input is 
public class multipleof7 {
    public static void main(String[] args) {
      int N;
      Scanner sc=new Scanner(System.in);
      N=sc.nextInt();
      if(N%7==0)
        System.out.println("yes");
      else
        System.out.println("no");
    }
}