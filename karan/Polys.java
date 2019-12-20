class Superc{
    void Shapes(){
        System.out.println("Its Spherical in super");
    }
}
class Subc extends Superc{
    void Shapes(){
        System.out.println("Its Spherical in sub");
    }
}
class Polys extends Superc{
    public void Shapes(){
        System.out.println("Its Square in main");
    }
    public static void main(String[] args) {
        Superc oj;
        oj=new Polys();
        oj.Shapes();
        oj=new Subc();
        oj.Shapes();
        oj=new Superc();
        oj.Shapes();
    }
}
