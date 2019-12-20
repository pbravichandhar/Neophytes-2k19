import java.io.*;

class super{
    final void fill(){
        System.out.println("JJJJJJ");
    }
}

class sub extends super{
    void fill(){
        System.out.println("JJJJJJ");
    }
}

class FinalInInheritance{
    public static void main(String[] args) {
        sub oj=new sub();
        oj.fill();
    }
}
