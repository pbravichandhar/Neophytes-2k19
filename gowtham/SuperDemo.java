class SuperDemo{
    public static void main(String[] args) {
        Ex1 ob= new Ex1(5);
        Ex1 ob1= new Ex2(8);
    }
}
class Ex1{
     Ex1(){
        super();
        System.out.println("In Example 1");
    }
    Ex1( int a){
        System.out.println("In Example 1 parameter");
    }
}
class Ex2 extends Ex1{
     Ex2(){
        super();
        System.out.println("In Example 2");
    }
    Ex2( int a){
        System.out.println("In Example 2 parameter");
    }
}