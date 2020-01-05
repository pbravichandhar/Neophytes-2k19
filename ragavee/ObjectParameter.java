class ObjectParameter{
    int a=10,b=10;
    public static void main(String args[]){
        Demo obj1=new Demo();
        Demo obj2=new Demo();
        System.out.println(obj1.func(obj2));
    }
    Boolean func(Demo d){
        return (d.a==d.b);
    }
}