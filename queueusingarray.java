public class queueusingarray {
    static class Queue{
        int arr[];
        int size;
        int rear;
        Queue(int n)
        {
            arr=new int [n];
            size=n;
            rear=-1;
        }
        public boolean isEmpty()
        {
            return rear==-1;
        }
        public  void add(int data)
        {
            if(rear==size-1)
            {
                System.out.print("It is full");
            }
            rear++;
            arr[rear]=data;
        }
        public  int remove()
        {
            if(isEmpty())
            {
                System.out.print("it is empty");
            }
            int r=arr[0];
            for(int i=0;i<rear;i++)
            {
                arr[i]=arr[i+1];
            }
            rear--;
            return r;
        }
        public  int peek()
        {
            if(isEmpty())
            {
                System.out.print("It is empty");
            }
            int a=arr[0];
       return a;
        }
    }
    public static void main(String aone[])
    {
       Queue a=new Queue(5);
       a.add(1);
       a.add(2);
       a.add(3);
       while(!a.isEmpty())
       {
        System.out.println(a.remove());
      }
    }
}
