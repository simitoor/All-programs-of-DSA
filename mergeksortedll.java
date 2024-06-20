 import java.util.*;
public class mergeksortedll {
     public static void main(String[] args) {
        LinkedList <Integer> a=new LinkedList<>();
        a.add(1);
        a.add(3);
        a.add(7);
        LinkedList <Integer> b=new LinkedList<>();
        b.add(2);
        b.add(4);
        b.add(8);
        LinkedList <Integer> c=new LinkedList<>();
        c.add(9);
        c.add(10);
        c.add(11);
        PriorityQueue <Integer> sb=new PriorityQueue<>();
        while(!a.isEmpty())
        {
            sb.add(a.remove());
        }
        while(!b.isEmpty())
        {
            sb.add(b.remove());
        }
        while(!c.isEmpty())
        {
            sb.add(c.remove());
        }
        LinkedList <Integer> sol=new LinkedList<>();
        while(!sb.isEmpty())
        {
             sol.add(sb.remove());
        }
        System.out.println(sol);
    }
} 
    

