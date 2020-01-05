import java.util.*;
public class AnimalsLeg
{

    static int animals(int chick,int cow,int pig)
    {
        int ans=2*chick+4*(cow+pig);
        return(ans);
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
        System.out.println("Enter the count of animals(chick,cow,pig)");
		int chick=sc.nextInt();
		int cow=sc.nextInt();
		int pig=sc.nextInt();
		System.out.print("Total animals Leg:"+animals(chick,cow,pig));

	}
}
