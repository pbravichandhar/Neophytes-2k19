public class OverloadingAndRiding{
    public static void main(String args[]){
        Sum s=new Sum();
        System.out.println(s.sum(10,20));
        System.out.println(s.sum(30,45,11));
        main("Hello", "World");
    }
    public static void main(String arg1,String arg2){
        System.out.println(arg1 +" "+ arg2);
    }
    private void printing1(){
        System.out.println("Inside Base Class");
    }
}
class Sum{
    public int sum(int a,int b){
        return (a+b);
    }
    public float sum(int a,int b,int c){
        return (a+b);
    }
}
//end