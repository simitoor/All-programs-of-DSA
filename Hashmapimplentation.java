
import java.util.ArrayList;
import java.util.LinkedList;

public class Hashmapimplentation {
    static class Hashmap<K,V>
    {
          private class Node{
            K key;
            V value;
            public Node(K key,V value)
            {
                this.key=key;
                this.value=value;
            }
          }
          private int N;
          public int n;
          private LinkedList <Node> buckets[];
         @SuppressWarnings("unchecked")
         public Hashmap()
         {
            this.N=4;
            this.buckets=new LinkedList[4];
            for(int i=0;i<4;i++)
            {
                this.buckets[i]=new LinkedList<>();
            }
         }
         public int hashing(K key)
         {
            int cd=key.hashCode();
            return Math.abs(cd)%buckets.length;
         } 
         public int searchinll(K key,int bi)
         {
            LinkedList <Node> ll=buckets[bi];
            int di=0;
            for(int i=0;i<ll.size();i++)
            {
                Node node=ll.get(i);
                if(key==node.key){
                return di;
                }
                di++;
            }
            return -1;
         }
         public boolean containskey(K key)
         {
         int bi=hashing(key);
            int di=searchinll(key,bi);
            if(di!=-1)
            {
              return true;  
            }
            else{
               return false;
            }
         }
         public V get(K key)
         {
             
            int bi=hashing(key);
            int di=searchinll(key,bi);
            if(di!=-1)
            {
              Node r=buckets[bi].get(di);
              return r.value; 
            }
            else{
               return null;
            }
         }
         public V remove(K key)
         {
            int bi=hashing(key);
            int di=searchinll(key,bi);
            if(di!=-1)
            {
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
            else{
               return null;
            }
         }
         public ArrayList<K> keyset()
         {
            ArrayList <K> a=new ArrayList<>();
            for(int i=0;i<buckets.length;i++)
            {
                LinkedList <Node> ll=buckets[i];
                for (Node keys :ll) {
                    a.add(keys.key);
                }
            }
            return a;
         }
         public boolean isEmpty()
         {
            return n==0;
         }
         @SuppressWarnings("unchecked")
         private void rehashing()
         {
            LinkedList <Node> oldbucks[]=buckets;
            buckets=new LinkedList[N*2];
            N=N*2;
            for(int i=0;i<buckets.length;i++)
            {
               buckets[i]=new LinkedList<>();
            }
            for(int i=0;i<oldbucks.length;i++)
            {
                LinkedList<Node> ll=oldbucks[i];
                for(int j=0;j<ll.size();j++)
                {
                    Node node=ll.get(j);
                    put(node.key,node.value);
                }

            }
         }
         public void put(K key,V value)
         {
            int bi=hashing(key);
            int di=searchinll(key,bi);
            if(di!=-1)
            {
                Node node=buckets[bi].get(di);
                node.key=key;
            }
            else{
                buckets[bi].add(new Node(key, value));
                n++;
            }
            double lambda=(double)n/N;
            if(lambda>2.0)
            {
                rehashing();
            }
         }
    }
    public static void main(String[] args) {
        Hashmap<String,Integer> sb=new Hashmap<>();
        sb.put("India", 135);
        sb.put("Australia",123);
        sb.put("Afroca",334);
        ArrayList <String> s=sb.keyset();
        for (String sol : s) {
            System.out.println(sol);
        }
        System.out.println(sb.get("India"));
        System.out.println(sb.containskey("India"));
        sb.remove("India");
        System.out.println(sb.containskey("India"));
        System.out.println(sb.isEmpty());
    }
}
