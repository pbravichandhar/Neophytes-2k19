class CallByVal 
{  
    int data=50;  
    void change(int data){  
        data=data+100;                                     //changes will be in local variable only  
    }  
     
    public static void main(String args[])
    {  
        CallByVal op=new CallByVal();
        System.out.println("before change "+op.data);  
        op.change(500);                                  //change the data in method but not affect in this main class
        System.out.println("after change "+op.data);  
    }  
}
