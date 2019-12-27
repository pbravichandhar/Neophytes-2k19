class Product{
    public static void main(String[] args) {
        int[] a=new int[1000];
        int i=0;
        long r=1 , mod=Mathpow(10,9)+7;
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();

        
        
        for(i=0;iN;i++)
        {
            a[i]=s.nextInt();
        }

        for(i=0;iN;i++)
        {
            r=ra[i]%mod;
        }
        System.out.println(r);
    }
}