class a{
    public void shape(){
        System.out.println("Shape 1 in a");
    }
}
class b extends a{
    public void shape(){
        System.out.println("Shape 1 in b");
    }
}
class Polynomial{
    public static void main(String[] args) {
        b oj = new b();
        oj.shape();
    }
}
