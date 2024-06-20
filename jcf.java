import java.util.LinkedList;
public class jcf {
    public static void main(String acs[])
    {
        LinkedList<Integer> ll=new LinkedList<>();
        ll.addFirst(3);
        ll.addLast(2);
        ll.addLast(1);
        System.out.println(ll);
        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);
    }
}
