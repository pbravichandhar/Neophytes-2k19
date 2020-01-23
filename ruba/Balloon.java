import java.util.*; 00 
class Balloon
{
    
    public static void calc(int[] arr1,int mid)
    {
        int k=0,h=0;
        //System.out.print(mid);
        for(int i=mid;i>0;i--)
        {
            arr1[i]=arr1[mid]-k;
            k++;
        }
            
            for(int j=mid;j<arr1.length;j++)
            {
                
                arr1[j]=arr1[mid]-h;
                h++;
            }
        
       System.out.println(k);
        for(int l=0;l<arr1.length;l++)
        {
            System.out.println(arr1[l]);
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int[] arr=new int[len];
        int count=0;
        for(int i=0;i<len;i++)
        {
            arr[i]=sc.nextInt();
        }
        int mid=(len/2);
        int length=(arr[mid]*2)+1;
       // System.out.print(length);
       
        if(len%2==1)
        {
            if(len==length)
            {
                for(int i=0;i<len;i++)
                {
                    
                    if(arr[i]==0)
                    {
                        if(arr[mid]!=0)
                        count++;
                    }
                    else{
                        
                        System.out.print("enter crt length ");
                        break;
                    }
                }
            }
                else
                {
                    System.out.print("please enter crt position elements");
                }
                
            
        }
        else
        {
            System.out.print("please give odd array length");

        }
        //System.out.print("count value"+count);
        if(count==len)
        {
            calc(arr,mid);
        }
    }
}