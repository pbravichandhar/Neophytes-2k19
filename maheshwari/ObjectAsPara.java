public class ObjectAsPara{
    int a;
    public static void main(String args[]){
        ObjectAsPara obj=new ObjectAsPara();
        obj.reference(obj);

    }
    public void reference(ObjectAsPara obj){
        System.out.println(obj);
    }
}