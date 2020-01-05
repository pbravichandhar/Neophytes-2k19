import java.util.Scanner;
public class Farmer{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int chickens,cows,pigs,legs;
        chickens=scan.nextInt();
        cows=scan.nextInt();
        pigs=scan.nextInt();
        legs=(chickens*2)+(cows*4)+(pigs*4);
        System.out.println(legs);
    }
}