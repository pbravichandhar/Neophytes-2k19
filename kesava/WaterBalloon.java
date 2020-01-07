import java.util.Scanner;
public class WaterBalloon {
    private static void Show(int [] arr)
    {
        int Len=arr.length,MiddleElement=arr[Len/2],MiddleIndex=arr.length/2;
        for(int i=0;i<arr.length;i++)
        {
            if(arr.length/2>i)
            {
                if((MiddleElement-MiddleIndex)<0)
                {
                    arr[i]=0;
                    MiddleIndex--;
                }
                else {
                    arr[i] =MiddleElement-MiddleIndex;
                    MiddleIndex--;
                }
            }
            if(arr.length/2==i)
            {
                MiddleIndex=1;
            }
            if(arr.length/2<i)
            {
                if(MiddleElement-MiddleIndex<0)
                {
                    arr[i]=0;
                    MiddleIndex++;
                }
                else {
                    arr[i] = MiddleElement-MiddleIndex;
                    MiddleIndex++;
                }
            }
        }
        for(int item:arr)
        {
            System.out.print(item+"\t");
        }
    }
    public static void main(String [] args)
    {
        try {
            Scanner s = new Scanner(System.in);
            int Size, i = 0, temp;
            Size = s.nextInt();
            if (Size % 2 == 0) {
                System.out.println("Size Should be odd");
                System.exit(0);
            }
            int[] arr = new int[Size];
            for (i = 0; i < Size; i++) {
                if (i == Size / 2)
                {
                    arr[i] = s.nextInt();
                } else
                    {
                    temp = s.nextInt();
                    if (temp == 0) {
                        arr[i] = temp;
                    }
                    else if(temp<0|| temp>0)
                    {
                        System.out.println("Invalid test case");
                        System.exit(0);
                    }
                }
            }
            Show(arr);
        }
        catch(Exception err)
        {
            System.out.println("Enter Integer Value"+err);
        }
    }
}
