class Palindrome{
    public static void main(String[] args) {
        int[] a={1,2,2,1};
        int[] b=new int[4];
        int[] c=new int[4];
    

        int n=4,i,j=0,res=0,res1=0;
        for(i=0;i<n/2;i++)
        {
            b[i]=a[i];
        }
        for(i=n/2;i<n;i++)
        {
            c[j]=a[i];
            j++;
        }

        for(i=0;i<2;i++){
            System.out.println(b[i]);  
            res=res+b[i];
        }
        for(i=0;i<2;i++){
            System.out.println(c[i]);
            res1=res1+c[i]; 
        }
        if(res==res1)
            System.out.println("palindrome");
        else
        System.out.println("Not palindrome");
        
    }
}