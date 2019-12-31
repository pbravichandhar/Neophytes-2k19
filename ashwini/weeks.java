enum days
{
    sunday,monday,tuesaday,wednesday,thursday,friday
}
class weeks
{
public static void main(String[] args)
{
    Integer iob=100;
    int i=iob;
    ++iob;
    System.out.println("value with: "+iob);
    days d;
    System.out.println("All the weeks we have: ");
    days dArray[]=days.values();
    for(days a:dArray)
    System.out.println(a);
    d=days.valueOf("sunday");
    System.out.println("it is: "+d.ordinal()+d.name()+d.compareTo(days.monday));
}
}