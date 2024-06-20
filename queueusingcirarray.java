public class queueusingcirarray {
     static class Queue{
            int arr[];
            int size;
            int rear;
            int front;
            Queue(int n)
            {
                arr=new int [n];
                size=n;
                rear=-1;
                front=-1;
            }
            public  boolean isEmpty()
            {
                return rear==-1;
            }
            public boolean isFull()
            {
                return (rear+1)%size==front;
            }
            public  void add(int data)
            {
                if(isFull())
                {
                    System.out.print("It is full");
                }
                if(front==-1)
                {
                    front=0;
                }
                rear=(rear+1)%size;
                arr[rear]=data;
    
            }
            public  int remove()
             {
                if(isEmpty())
                {
                    System.out.print("it is empty");
                }
               int r=arr[front];
               if(front==rear)
               {
                front=rear=-1;
               }
               else 
               {
                front=(front+1)%size;
               }
                return r;
             }
            public  int peek()
            {
                if(isEmpty())
                {
                    System.out.print("It is empty");
                }
            return arr[front];
            }
        }
        public static void main(String aone[])
        {
           Queue a=new Queue(3);
           a.add(1);
           a.add(2);
           a.add(3);
           System.out.println(a.remove());
           a.add(4);
           System.out.println(a.remove());
           a.add(5);
           while(!a.isEmpty())
           {
            System.out.println(a.remove());
          }
        }
    }
    

