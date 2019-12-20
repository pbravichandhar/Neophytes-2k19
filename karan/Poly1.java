class Poly1{
    void Add(int a,int b){
        System.out.println("the sum of two int is :" +(a+b));
    }
    void Add(int a,int b,int c){
        System.out.println("the sum of three int is :" +(a+b+c));
    }
    void Add(int a,double b){
        System.out.println("the sum of int and float is :" +(a+b));
    }
    void Add(double a,int b){
        System.out.println("the sum of tw int is :" +(a+b));
    }
    void Add(double a,double b){
        System.out.println("the sum of tw int is :" +(a+b));
    }
    public static void main(String[] args) {
        Poly1 oj=new Poly1();
        oj.Add(10,20);
        oj.Add(10,20,30);
        oj.Add(12,20.56);
        oj.Add(20.56,12);
        oj.Add(12.56,12.44);
    }
}
