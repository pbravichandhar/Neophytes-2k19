import java.util.*;
class BallonProb
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] arr = new int[size];
        int count=0;
        if(size%2 == 0)
        {
            System.out.println("Enter the valid array input");
            return;
        }
        for(int i = 0 ; i < size ; i++)
        {
            arr[i] = s.nextInt();
            if(arr[i] ==0)
            count++;
        }
        if(size%2 == 1 && arr[(size/2)] != 0 && count == size-1 && arr[(size/2)] > 0 )
        {
            for(int i = (size/2) ; i > 0 ; i-- )
            {
                if(arr[i] != 0)
                arr[i-1] = arr[i] - 1;
            }
            for(int i = (size/2) ; i<size-1 ; i++)
            {
                if(arr[i] != 0)
                arr[i+1] = arr[i] - 1;
            }
            for(int i=0;i<size;i++)
            {
                System.out.println(arr[i]);
            }
        }
        else if(arr[(size/2)] == 0 && count == size)
        {
            for(int i=0;i<size;i++)
            System.out.print(arr[i]);
        }
        else if(count > 1 || count == 0)
        {
            System.out.println("Invalid input");
        }
    }
}