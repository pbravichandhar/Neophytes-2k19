enum cricketers
{
    dhoni,sachin,raina,yuvraj,rohit
}
public class Enum{
    public static void main(String[] args) {
        cricketers c;
        c=cricketers.raina;
        switch(c)
        {
            case dhoni:System.out.println("I am"+c.dhoni);
                        break;

            case sachin:System.out.println("I am"+c.sachin);
                        break;

            case raina:System.out.println("I am"+c.raina);
                        break;

            case yuvraj:System.out.println("I am"+c.yuvraj);
                        break;

            case rohit:System.out.println("I am"+c.rohit);
                       break;
        }
      
    }
}