class Data {
    int data1;
    int data2;
}

class SetData {
    void setData(Data da,int d1,int d2) {
        da.data1 = d1;                                  
        da.data2 = d2;
    }
    
    void getData(Data da) {
        System.out.println("data1 : "+da.data1);
        System.out.println("data2 : "+da.data2);
    }
}

public class ObjectAsParameter {

    public static void main(String[] args) {
        Data da = new Data();                           //it initialize the data1&2 
        SetData sd = new SetData();                     //first setdata use d1&2 as variable
        sd.setData(da,50,100);                          //allocate the data to the d1&d2 using da object
        sd.getData(da);                                 //display the value allocated to the variable
    }
}
