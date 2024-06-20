import java.util.Stack;

public class stringpalindrome {
    static class Node{
        Character data;
        Node next;
        public  Node(Character data)
        {
            this.data=data;
            this.next=null;
        }
    }
    public void palindrome()
    {
        Stack <Character> s=new Stack<>();
        Node slow=head;
        Node prev=null;
        Node midnode;
         Node fast=head.next;
            while(fast!=null && fast.next!=null)
            {
                prev=slow;
                slow=slow.next;
                fast=fast.next.next;
            }
            if(size%2==0)
            {
              midnode=slow.next;
              slow.next=null;
            }
            else{
                 midnode=slow.next;
                prev.next=null;
            }
            Node temp=head;
            while(temp!=null)
            {
               s.push(temp.data);
               temp=temp.next;
            }
            int flag=0;
            while(midnode!=null)
            {
                if(midnode.data!=s.peek())
                {
                    flag=1;
                    break;
                }
                else{
                    midnode=midnode.next;
                    s.pop();
                 }
            }
            if(flag==0 && s.isEmpty())
            {
                 System.out.println("It is palindrome");
            }
            else{
                System.out.println("It is not palindrome");
            }
     }
        public static Node head;
        public static int size;
        public static Node tail;
        public void addFirst(Character data)
        {
            Node newnode=new Node(data);
            size++;
            if(head==null)
            {
                head=tail=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static void main(String[] args) {
            stringpalindrome a=new stringpalindrome();
            a.addFirst('A');
            a.addFirst('B');
            a.addFirst('C');
            a.addFirst('D');
            a.addFirst('B');
            a.addFirst('A');
            a.palindrome();
        }
}
