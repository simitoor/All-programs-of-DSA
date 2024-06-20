class linkedlist {
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
         public static int size;
         public static Node tail;
         public  void reverse()
         {
            Node curr=tail=head;
            Node next;
            Node prev=null;
            while(curr!=null)
            {
                next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;
            }
            head=prev;
         }
         public static Node midnode(Node head)
         {
            Node slow=head;
            Node fast=head.next;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
             }
             return slow;
            }
            public boolean palindrome(){
                if(head==null || head.next==null)
                return true;
            Node curr=midnode(head);
            Node prev=null;
            Node nextt;
            while(curr!=null)
            {
                nextt=curr.next;
                curr.next=prev;
                prev=curr;
                curr=nextt;
             }
             Node left=head;
             Node right=prev;
             while(right!=null)
             {
                if(right.data!=left.data)
                {
                    return false;
                }
                right=right.next;
                left=left.next;
             }
             return true;
                        }
         public static boolean cycle()  
         {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast)
                {
                    return true;
                }
               
            }
            return false;
         }             
         public void addFirst(int data)
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
          public void lastadd(int data)
         {
             Node newnode=new Node(data);
             size++;
             if(head==null)
             {
                 head=tail=newnode;
             }
             tail.next=newnode;
             tail=newnode;
         }
         public void addinmiddle(int index,int data)
         {
             if(index==0)
             {
                 addFirst(data);
                 return;
             }
             Node newnnode=new Node(data);
             size++;
             Node temp=head;
             int i=0;
             while(i!=index-1)
             {
                 temp=temp.next;
                 i++;
             }
             newnnode.next=temp.next;
             temp.next=newnnode;
         }
         public int removelast()
         {
             if(size==0)
             {
                 System.out.print("It is empty");
                 return Integer.MIN_VALUE;
             }
             else if(size==1)
             {
                 int val=head.data;
                 head=tail=null;
                 size=0;
                 return val;
 
             }
             Node temp=head; 
             int i=0;
             while(i!=size-2) 
             {
                 temp=temp.next;
                 i++;
             }
             int val=temp.next.data;
             temp.next=null;
             tail=temp;
             size--;
             return val;
         }
         public int removefirst()
         {
             if(size==0)
             {
                 System.out.print("It is empty");
                 return Integer.MIN_VALUE;
             }
             else if(size==1)
             {
                 int val=head.data;
                 head=tail=null;
                 size=0;
                 return val;
 
             }
             int val=head.data;
             head=head.next;
             size--;
             return val;
         }
         public static int recurisvesearch(int key,int index,Node temp)
         {
          
             if(temp==null)
             {
                 return -1;
             }
             if(temp.data==key)
             {
                 return index+1;
             }
            return recurisvesearch(key, index+1, temp.next);
         } 
         public static Node merge(Node head1,Node head2)
         {
            Node merged=new Node(-1);
            Node temp=merged;
            while(head1!=null && head2!=null)
            {
               if(head1.data<=head2.data)
                {
                    temp.next=head1;
                    head1=head1.next;
                    temp=temp.next;
                }
                else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
                }
            }
               while(head1!=null)
               {
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
               }
               while(head2!=null)
               {
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
               }
             return merged.next;
         }
         public Node mergesort(Node head)
         {
            if(head==null || head.next==null){
            return head;
            }
            Node mid=midnode(head);
            Node righthead=mid.next;
            mid.next=null;
            Node newleft=mergesort(head);
            Node newright=mergesort(righthead);
            return merge(newleft,newright);
          }
         public  void removenfromend(int i)
         {
            int index=0;
            if(i==0)
            {
                head=head.next;
                return;
            }
            Node temp=head;
            while((index+1)!=i)
            {
                temp=temp.next;
                index++;
            }
            temp.next=temp.next.next;
            return;
         }
         public static int iterativesearch(int key)
         {
            Node temp=head;
             for(int i=0;i<size;i++)
             {
                 if(temp.data==key)
                 {
                     return i;
                 }
                 temp=temp.next;
             }   
             return -1;
         }
         public static void removeloop()
         {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                if(slow==fast)
                {
                    slow=head;
                    Node prev=null;
                    while(slow!=fast)
                    {
                        slow=slow.next;
                        prev=fast;
                        fast=fast.next;
                        }
                        prev.next=null;
                }
               }
        }
        public Node zigzag(Node head)
        {
            Node mid=midnode(head);
            Node curr=mid.next;
           mid.next=null;
            Node prev=null;
            while(curr!=null)
            {
                Node next=curr.next;
                curr.next=prev;
                prev=curr;
                curr=next;

            }
           tail=prev;
           Node merged=new Node(-1);
           Node temp=merged;
           Node temp1=head;
           while(tail!=null && temp1!=null)
           {
            temp.next=temp1;
            temp1=temp1.next;
            temp=temp.next;
            temp.next=tail;
            tail=tail.next;
            temp=temp.next;
              }
              while(tail!=null)
              {
                temp.next=tail;
                tail=tail.next;
                temp=temp.next;
              }
              while(temp1!=null)
              {
                temp.next=temp1;
                temp1=temp1.next;
                temp=temp.next;
              }
           return merged.next; 
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
     public static void main(String arrr[])
         {
            linkedlist l=new linkedlist();
             l.addFirst(2);
             l.addFirst(1);
             l.addFirst(4);
             l.addFirst(3);
             l.addFirst(5);
             l.addFirst(8);
            l.print();
         //   l.addinmiddle(2,8);
           /*   l.print();
              System.out.println(l.size);
             System.out.println(l.removefirst());
          System.out.println(l.removelast());
             l.print();
           System.out.println(l.iterativesearch(3));
         System.out.println(l.recurisvesearch(2,0,head));
         l.reverse();
         l.print();;
         int n=5;
         l.removenfromend(size-n);
         l.print();*/
        // System.out.print(l.palindrome());
      /*   head=new Node(1);
        Node temp=new Node(2);
        head.next=temp; 
        head.next.next=new Node(3);
        head.next.next.next=temp;
        System.out.println(cycle());
        removeloop();
        System.out.println(cycle());
      l.head=l.mergesort(l.head);
      l.print();*/
      l.zigzag(head);
      l.print();
 }
}