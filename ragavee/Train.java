mport java.util.*;

class Train{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        int seatnum=obj.nextInt();
        int compartement;
        if(seatnum%12==0)   //if seatnum divides with 12 it gives exact compartement num
        compartement=(int)seatnum/12;  //
        else
        compartement=(seatnum/12)+1;   //to get compartement num when decimal occurs while dividing
        int last_seat=compartement*12;
        int first_seat=last_seat-11;
        int opp_seat=(last_seat-seatnum)+first_seat;
        int seat=opp_seat%6;
        System.out.println(opp_seat);
        if(seat==0||seat==1)
        System.out.println("window seat");
        else if(seat==2||seat==5)
        System.out.println("middle seat");
        else if(seat==3||seat==4)
        System.out.println("aisle seat");
    }
}