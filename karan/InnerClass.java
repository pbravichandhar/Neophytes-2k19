class outside{
    void display(){
        System.out.println("Inside the Outer class");
        class inside{
            void display(){
                System.out.println("Inside the Inner class");
            }
        }
        inside oj=new inside();
        oj.display();
    }
}
class InnerClass {
    public static void main(String[] args) {
        outside oj=new outside();
        oj.display();
    }
}
