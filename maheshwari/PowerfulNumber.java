import java.util.Scanner;
public class PowerfulNumber{
   public static void main(String args[]){
      int number,temp=0,count1=0,i,count2=0;
      try{
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter a number :");
      number = sc.nextInt();
      temp=number;      
      for(i=2;i<number;i++){
         while(number%i==0){
            number=number/i;
            count1++;
            if(temp%Math.pow(i,2)==0){
                count2++;
            }
         }
      }
      }catch(Exception e){
          System.out.println(e);
      }
      if(count1!=0&&count2!=0){
          if(count1==count2){
          System.out.println("Powerful number "+count1);
      }
      }
      else{
          System.out.println("Not a powerful number");
      }
   }
}

