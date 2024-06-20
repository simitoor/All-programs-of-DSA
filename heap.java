import java.util.ArrayList;

public class heap {
    ArrayList <Integer> sb=new ArrayList<>();
    public  void insert(int key)
    {
        sb.add(key);
        int k=sb.size()-1;
        while(sb.get(k)<sb.get(((k)-1)/2))
        {
            int temp=sb.get(k);
           sb.set(k, sb.get(((k)-1)/2));
           sb.set(((k)-1)/2, temp);
            k=((k)-1)/2;
        }
     }
     public  int peek()
     {
        return sb.get(0);
     }
     private void hashify(int i)
     {
        int minidx=i;
        int leftc=2*i+1;
        int rightc=2*i+2;
        if(leftc<sb.size() && sb.get(leftc)<sb.get(minidx))
        {
            minidx=leftc;
        } 
        if(rightc<sb.size() && sb.get(rightc)<sb.get(minidx))
        {
            minidx=rightc;
        }
        if(minidx!=i)
        {
            int ir=sb.get(i);
            sb.set(i,sb.get(minidx));
            sb.set(minidx,ir);
            hashify(minidx);
        }
     }
     public boolean isEmpty()
     {
        return sb.size()==0;
     }
     public int remove()
     {
        int data=sb.get(0);
        int temp=sb.get(0);
        sb.set(0,sb.get(sb.size()-1));
        sb.set(sb.size()-1,temp);
        sb.remove(sb.size()-1);
        hashify(0);
        return data;
     }
    public static void main(String[] args) {
      heap h=new heap();
      h.insert(4);
      h.insert( 7);
      h.insert( 1);
      h.insert(2);
      h.insert(10);
     
      while(!h.isEmpty())
      {
        System.out.println(h.peek());
        h.remove();

      }
    }
}
