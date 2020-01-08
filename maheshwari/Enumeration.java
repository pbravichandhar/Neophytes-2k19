enum Enumerations{
    one,two,three,four,five,six,seven;
}
class Enumeration{
    public static void main(String args[]){
    Enumerations earr[]=Enumerations.values();
    for(Enumerations e:earr){
        System.out.println(e);
        System.out.println(e.ordinal());

    }
}
}
//end of the program


