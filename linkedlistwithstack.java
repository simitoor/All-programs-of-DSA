public class linkedlistwithstack {
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
    static class Stack
    {
     static Node head=null;
     public  boolean isEmpty()
     {
        if(head==null)
        {
            return true;
        }
        return false;
     }
     public void push(int data)
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
     public  int pop()
     {
        if(isEmpty())
        return -1;
        int cal=head.data;
        head=head.next;
        return cal;
     }
     public  int peek()
     {
        if(isEmpty())
        return -1;
        return head.data;
     }
    }
public static void main(String []a)
   { 
     Stack s=new Stack();
     s.push(1);
     s.push(2);
     s.push(3);
     s.push(4);
     while(!s.isEmpty())
     {
        System.out.println(s.pop());
    
     }
    }
}

