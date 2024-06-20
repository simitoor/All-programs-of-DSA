public class doublyll
{
    public class Node{
       int data;
       Node next;
       Node prev;
      public Node(int data)
       {
           this.data=data;
           this.next=null;
           this.prev=null;
       }
    }
    public static Node head;
    public static Node tail;
    public static int size;
    public  void addfirst(int data)
    {
        Node temp=new Node(data);
        size++;
        if(head==null)
        {
            head=tail=temp;
            return;
          }
          temp.next=head;
          head.prev=temp;
         
         head=temp;
      
    }
    public void addlast(int data)
    {
      Node newnode=new Node(data);
      size++;
      if(head==null)
      {
        head=tail=newnode;
        return;
      }
      tail.next=newnode;
      newnode.prev=tail;
      tail=newnode;
    }
    public int removelast()
    {
      if(head==null)
      {
        return Integer.MIN_VALUE;
      }
      else if(size==1)
      {
        int val=head.data;
        head=tail=null;
        size--;
        return val;
      }
      else{
      int val=tail.data;
      (tail.prev).next=null;
      size--;
      return val;
      }
    }
    public void reverse()
    {
      Node curr=head;
      Node prev=null;
      Node nextt;
      while(curr!=null)
      {
        nextt=curr.next;
        curr.next=prev;
       curr.prev=nextt;
        prev=curr;
        curr=nextt;
        }
        head=prev;
    }
    public int removefirst()
    {
      if(head==null)
      {
        System.out.print("It is empty");
       return Integer.MIN_VALUE;
      }
      else if(size==1)
      {
        int val=head.data;
         head=tail=null;
         size--;
        return val;
      }
      else{
      int data=head.data;
      head=head.next;
      head.prev=null;
      size--;
      return data;
      }
    }
    public void print()
    {
        Node temp=head;
        while(temp!=null)
      {
        System.out.print(temp.data+"<->");
        temp=temp.next;
      }
      System.out.println("null");
    }
   
    public static void main(String avs[])
    {
        doublyll a=new doublyll();
        a.addfirst(4);
        a.addfirst(5);
        a.addfirst(1);
        a.addfirst(7);
        a.addlast(10);
        a.addfirst(12);
        a.print();
       System.out.println(a.removefirst());
        System.out.println(a.removelast());
      //  a.print();
      //  System.out.println(size);
        a.reverse();
        a.print();
    }
}
