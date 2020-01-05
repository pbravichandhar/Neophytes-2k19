public class ForEach{
    public static void main(String args[]){
        char name[]={'M','a','h','e','s','h'};
        int num[]={1,2,3,4,5,6,7,8,9};
        for(char i:name){
            System.out.print(i);
        }
        System.out.println();
        for(int j:num){
            System.out.println(j);
        }
    }
}