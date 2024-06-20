public class swapnodes {
    static class Node{
        int data;
        Node next;
        public  Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
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
     public void swaps(int key,int key1)
     {
        if(key==key1)
        {
            return;
        }
        Node prev=null;
        Node temp=head;
        Node temp1=head;
        Node prev1=null;
        while(temp.data!=key && temp!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        while(temp1.data!=key1 && temp1!=null)
        {
            prev1=temp1;
            temp1=temp1.next;
        }
        if(prev==null && prev1==null)
        {
            return;
        }
         if(prev!=null)
         {
            prev.next=temp1;
         }
         else{
            head=temp1;
         }
         if(prev1!=null)
         {
            prev1.next=temp;
         }
         else{
            head=temp;
         }

        Node temp2=temp.next;
        temp.next=temp1.next;
        temp1.next=temp2;
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
    public static void main(String []aq)
    {
        swapnodes a=new swapnodes();
        a.addFirst(4);
        a.addFirst(3);
        a.addFirst(2);
        a.addFirst(1);
        a.swaps(1, 3);
        a.print();
    }
}
