 class deletingnnodesafterm{
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
    public static Node head;
    public static Node tail;
    public void lastadd(int data)
    {
        Node newnode=new Node(data);
       
        if(head==null)
        {
            head=tail=newnode;
        }
        tail.next=newnode;
        tail=newnode;
    }
    public void removes(int m,int n)
    {
        Node temp=head;
        Node prev=null;
        while(temp!=null)
        {
            int i=0,j=0;
            while(i!=m)
            {
                prev=temp;
                temp=temp.next;
                i++;
            }
            while(j!=n)
            {
                prev.next=temp.next; 
                temp=temp.next;
                j++;
            }
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

       public static void main(String[] args)
     {
        deletingnnodesafterm l=new deletingnnodesafterm();
        l.lastadd(1);
        l.lastadd(2);
        l.lastadd(3);
        l.lastadd(4);
        l.lastadd(5);
        l.lastadd(6);
        l.lastadd(7);
        l.lastadd(8);
        l.removes(2,2);
        l.print();
        
    }

 }
    

