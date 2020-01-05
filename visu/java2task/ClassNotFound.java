// Java program to illustrate the  
// concept of ClassNotFoundException 
class ClassNotFound {

}

class java {

}

class MyClass {
public static void main(String[] args) 
    { 
        Object o = class.forName(args[0]).newInstance(); 
        System.out.println("Class created for" + o.getClass().getName()); 
    }
}