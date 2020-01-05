import java.util.*;

class NoOfLegsInFarm{
    public static void main(String[] args) {
        int c,p,ch;
        Scanner sc=new Scanner(System.in);
        //Getting inputs 
        System.out.println("Enter no. of Chickens : ");
        ch=sc.nextInt();
        System.out.println("Enter no. of Pigs : ");
        p=sc.nextInt();
        System.out.println("Enter no. of Cows : ");
        c=sc.nextInt();
        //Printing No. of legs
        System.out.println(((ch*2)+(p*4)+(c*4)));
    }
}
