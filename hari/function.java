class Print {
    public void mysample() {
        System.out.println("Im from another java file from smaple class");
    }
}

class Overload {
    public static void over(int a) {
        System.out.println(a);
    }

    public static void over(char c) {
        System.out.println(c);
    }
}

class Args1
{ 
    static int n1=0,n2=1,n3=0;
    System.out.print(n1+" "+n2);
    public static void args(int ...num){
        if(num>1)
        {
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.print(" "+n3);
        } 
        args(num-1);
    } 
}