class Overload{
    public static void main(String args[]){
        Overload obj=new Overload();
        obj.func(10);
        obj.func('s',24);
        obj.func(20,'r');
        obj.func(2,3);
    }
    public void func(int a){
        System.out.println(a);
    }
    public void func(int a,char b){
        System.out.println(a+"\n"+b);
    }
    public void func(int a,int b){
        System.out.println(a+b);
    }
    public void func(char a,int b){
        System.out.println(a+"\n"+b);
    }   
}