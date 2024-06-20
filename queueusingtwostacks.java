import java.util.Stack;

public class queueusingtwostacks {
    static class queue{
        static Stack <Integer> sb=new Stack<>();
        static Stack<Integer> sb1=new Stack<>();
        public boolean isEmpty()
        {
            if(sb1.isEmpty())
            {
                System.out.println("It is empty");
                return true;
            }
            return false;
        }
        public  void add(int data)
        {
            sb.push(data);
        }
        public  void converting()
        {
            if(sb.isEmpty())
            {
                System.out.print("It is empty");
            }
            while(!sb.isEmpty())
            {
                sb1.push(sb.pop());
            }
        }
        public  int removing()
        {
            if(sb1.isEmpty())
            {
                System.out.print("It is empty");
                return -1;
            }
            return sb1.pop();
        }
            public static int peek()
            {
                if(sb1.isEmpty())
                {
                    System.out.print("It is empty");
                    return -1;
                }
                return sb1.peek();
            }
    }
    public static void main(String aujbd[])
    {
       queue a=new queue();
       a.add(1);
       a.add(2);
       a.add(3);
       a.converting();
       while(!a.isEmpty())
       {
        System.out.println(a.removing());
       }
    }
}
