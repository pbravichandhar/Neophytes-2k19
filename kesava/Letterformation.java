 Scanner s=new Scanner(System.in);

        Scanner s=new Scanner(System.in);

        int n,cnt = 0;


        n=s.nextInt();


        int[] count = new int[7];

        String str;
        str=s.next();
       // str=str.toLowerCase();
        for (int i=0;i<n;i++)
        {
                   if(str.charAt(i)=='h')count[0]+=1;
                   if(str.charAt(i)=='a')count[1]+=1;
                   if(str.charAt(i)=='c')count[2]+=1;
                   if(str.charAt(i)=='k')count[3]+=1;
                   if(str.charAt(i)=='e')count[4]+=1;
                   if(str.charAt(i)=='r')count[5]+=1;
                   if(str.charAt(i)=='t')count[6]+=1;
        }
        count[0]/=2;count[1]/=2;count[4]/=2;count[5]/=2;
        cnt=count[0];
        for(int i=0;i<7;i++)
        {
            if(cnt>count[i])
            {
                cnt=count[i];
            }
        }


        System.out.println(cnt);
 }
}
