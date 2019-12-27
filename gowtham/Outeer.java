class outer{
    class inner{
                void method()
                {
                    System.out.print("innerclass");
                }
                void show() { 
                    System.out.println("i am in show method of super class"); 
                          int myInt = 9;
                          double myDouble = myInt; // Automatic casting: int to double
                      
                          System.out.println(myInt);
                          System.out.println(myDouble);
                } 
                void show1(){
                    double myInt = 9;
                    int myDouble = (int) myInt; // Manual casting: double to int
                
                    System.out.println(myInt);
                    System.out.println(myDouble);
            }
        }
    }
        