

public class findintersectionll {
     static class Node
    {
      int data;
      Node next;
      Node(int data)
      {
        this.data=data;
        this.next=null;
      }
    }
    public static Node head1;
    public static Node head2;
    public static void inter()
    {
        while(head1!=null && head2!=null){
        if(head1.data==head2.data)
        {
            System.out.println("It's intersection is "+head1.data);
            return;
        }
        else if(head1.data>head2.data)
        {
            head2=head2.next;
         }
         else {
            head1=head1.next;
         }
        }
        System.out.println("There is not any intersection");
    }
    
    public static void main(String aw[])
    {
        head1=new Node(1);
        head2=new Node(4);
       Node newhead=new Node(2);
       head1.next=newhead;
       Node newhead1=new Node(3);
       head1.next.next=newhead1;
       Node newhead2=new Node(5);
       head2.next=newhead2;
       Node newhead3=new Node(6);
       head1.next.next.next=newhead3;
       head2.next.next=newhead3;
       Node newhead4=new Node(7);
       head1.next.next.next.next=newhead4;
       head2.next.next.next=newhead4;
       inter();
        }    
    
}
