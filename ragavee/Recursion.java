class Recursion{
    public static void main(String args[]){
        int var=5;
        func(var);
    }
    public static void func(int a){
        if(a<1)
        return;
        else
        System.out.println(a);
        func(a-1);
        System.out.println(a);
        return;
    }
}