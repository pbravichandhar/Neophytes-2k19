class outer{
    class inner{
        void method()
        {
            System.out.print("innerclass");
        }
    }
}
class outer1
{
    public static void main(String[] args) {
        outer.inner i=new outer().new inner();
        i.method();
    }
}