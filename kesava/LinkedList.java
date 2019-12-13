import javax.xml.crypto.Data;
import java.util.Scanner;

public class LinkedList {
    Node head;
    static class Node
    {
        Node next;
        int data;


        Node(int data)
        {
            this.data=data;
            next=null;
        }

    }


    public   static LinkedList intsertnode(LinkedList list, int data)
        {

            Node newnode=new Node(data);
            newnode.next=null;
            if(list.head==null)
            {
                list.head=newnode;
            }

            else
            {

                Node last=list.head;

               while (last.next!=null)
               {


                  last=last.next;

               }

                last.next=newnode;

            }


        return list;
        }


      public  static LinkedList display(LinkedList list)
        {

            StringBuilder result=new StringBuilder();
            Node currentnode=list.head;
            while (currentnode!=null)
            {

                result.append(" "+currentnode.data);

                currentnode=currentnode.next;
            }

            System.out.println("Linked list: "+result);

            return list;
        }



        static LinkedList delete(LinkedList list, int key)
        {

            Node current,previous = null;
            current=list.head;
            if(current!=null && current.data==key)
            {
                list.head=current.next;
            }
            
            while(current!=null && current.data!=key)
            {
                
               previous=current;
               current=current.next;
            }
            if(current!=null) {
                previous.next = current.next;
            }

            return list;
        }


        public static LinkedList Length(LinkedList list)
        {

            Node current;
            int count=0;
            current=list.head;
            while (current!=null)
            {
              count+=1;
              current=current.next;



            }

             System.out.println("\n The link list size: "+count+"\n");




            return list;

        }


    public static void main(String [] args)
    {

        LinkedList list= new LinkedList();

        Scanner s=new Scanner(System.in);
        int n,key;
        n=s.nextInt();
        for(int i=1;i<=n;i++) {
            list = intsertnode(list, i);

        }


        display(list);

        Length(list);

        System.out.println("A key to delete");  
            
        key=s.nextInt();

        delete(list,key);

        System.out.println("\nDeleting key= "+key+"\n");

        display(list);

        Length(list);


    }
}

