public class oddevenll {
    static class Node{
        int data;
        Node next;
        public  Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head1;
    public static Node tail;
    public void lastadd(int data)
         {
             Node newnode=new Node(data);
            
             if(head1==null)
             {
                 head1=tail=newnode;
             }
             tail.next=newnode;
             tail=newnode;
         }
    public static Node head;
    public void odds()
    {
       oddevenll a=new oddevenll();
       Node temp=head;
       Node prev=null;
       while(temp!=null){
    
       if(temp.data%2!=0)
       {
        if(prev==null)
        {
           head=head.next;
            a.lastadd(temp.data);
        }
        else{
         prev.next=temp.next;
         a.lastadd(temp.data);
        }
       }
       prev=temp;
       temp=temp.next;
    }
       Node temp1=head1;
       while(temp1!=null)
       {
        prev.next=temp1;
        temp1=temp1.next;
        prev=prev.next;
       }
    }
    public void print()
    {
        if(head==null)
        {
            System.out.println("It is empty");
            return;
        }
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
     }
     public void addFirst(int data)
         {
             Node newnode=new Node(data);
             
             if(head==null)
             {
                 head=newnode;
                 return;
             }
             newnode.next=head;
             head=newnode;
            }
             public static void main(String[] args) {
        oddevenll l=new oddevenll();
        l.addFirst(6);
        l.addFirst(1);
        l.addFirst(4);
        l.addFirst(5);
        l.addFirst(10);
        l.addFirst(12);
        l.addFirst(8);
        l.addFirst(3);
       l.odds();
        l.print();
     }
}
