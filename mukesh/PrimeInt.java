import java.util.*;
public class PrimeInt
{
    static void prime()
    {
        int flag=0;
        for(int index=2;index<Integer.MAX_VALUE;index++)
        {
            flag=0;
            for(int index1=2;index1<=index/2;index1++)
            {
                if(index%index1==0)
                {
                    flag=1;
                    break;
                }
                
            }
            if(flag==0)
            {
                System.out.print(index+" ");
            }
        }
    }
    
	public static void main(String[] args) {
	    prime();
	}
}