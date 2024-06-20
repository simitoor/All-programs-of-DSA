public class queueusingll {
    static class Node{
        int data;
        Node next;
         Node(int data)
        {
         this.data=data;
         this.next=null;
        }
    }
    public static Node head=null;
    public static Node tail=null;
     static class queue{
       public boolean isEmpty()
        {
           return (head==null && tail==null);
        }
    public void add(int data)
    {
     Node newnode=new Node(data);
        if(isEmpty())
        {
         head=tail=newnode;
         return;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public int remove()
    {
        if(isEmpty())
        {
            System.out.print("It is empty");
            return -1;
        }
        int r=head.data;
        if(head==tail)
        {
            head=tail=null;
            return r;
        }
         head=head.next;
        return r;
    }
    public  int peek()
    {
        if(isEmpty())
        {
            System.out.print("It is empty");
            return -1;
        }
        int val=head.data;
        return val;
    }
   
}
    public static void main(String rqa[])
    {
       queue a=new queue();
       a.add(1);
       a.add(2);
       a.add(3);
       while(!a.isEmpty())
       {
        System.out.println(a.remove());
       }
    }
}
