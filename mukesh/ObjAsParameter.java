class Data {

    int data1;
    int data2;
}

class SetData {

    void set(Data da, int d1, int d2) {
        da.data1 = d1;
        da.data2 = d2;
    }

    void get(Data da) {
        System.out.println("data1 : " + da.data1);
        System.out.println("data2 : " + da.data2);
    }
}

public class ObjAsParameter {

    public static void main(String[] args) {

        Data da = new Data();
        SetData sd = new SetData();
        sd.set(da, 50, 100);
        sd.get(da);
    }
}
